package CAMPUSMONK_PYQ;

import java.util.*;

public class Q28 {
    static int max = -1;
    static void dfs(int node, int parent, int currSum, int[] val, List<List<Integer>> tree, int k){
        currSum += val[node];
        boolean isLeaf = true;
        for(int child : tree.get(node)){
            if(child != parent){
                isLeaf = false;
                dfs(child, node, currSum, val, tree, k);
            }
        }

        if(isLeaf){
            if(currSum % k != 0){
                max=Math.max(max,currSum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n+1];
        for(int i=1;i<=n;i++){
            val[i] = sc.nextInt();
        }
        List<List<Integer>> tree = new ArrayList<>();

        for(int i=0;i<=n;i++){
            tree.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        int k = sc.nextInt();

        dfs(1,-1,0,val,tree,k);

        System.out.println(max);
    }
}

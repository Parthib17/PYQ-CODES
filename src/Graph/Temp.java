package Graph;

import java.util.*;
public class Temp {
    public static List<Integer> dfs(int x, List<List<Integer>> adj, List<Integer> dfs, int[] vis){
        vis[x] = 1;
        dfs.add(x);

        for (int nei : adj.get(x)){
            if(vis[nei] == 0)
                dfs(nei,adj,dfs,vis);
        }
        return dfs;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        List<Integer> dfs = new ArrayList<>();
        int[] vis = new int[v];

        System.out.println("Enter the edges: ");
        for(int i=0;i<e;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            adj.get(m).add(n);
            adj.get(n).add(m);
        }

        System.out.println(dfs(0,adj,dfs,vis));

    }
}

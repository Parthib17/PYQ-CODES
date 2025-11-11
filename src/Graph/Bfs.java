package Graph;

import java.util.*;
public class Bfs {
    public static List<Integer> bfs(List<List<Integer>> adj, List<Integer> bfs, int[] vis){
        Queue<Integer> q= new LinkedList<>();
        vis[0] = 1;
        q.add(0);

        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);

            for(int nei : adj.get(node)){
                if(vis[nei] == 0){
                    vis[nei] = 1;
                    q.add(nei);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        List<Integer> bfs = new ArrayList<>();
        int[] vis = new int[v];

        System.out.println("Enter the edges: ");
        for(int i=0;i<e;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            adj.get(m).add(n);
            adj.get(n).add(m);
        }

        System.out.println(bfs(adj,bfs,vis));

    }
}

package Graph;


import java.util.*;

public class NoOfProvinces {
    public static void bfs(List<List<Integer>> adj, int v, int[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[v]=1;
        q.add(v);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei : adj.get(node)){
                if(vis[nei] == 0){
                    vis[nei] = 1;
                    q.add(nei);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges: ");
        for(int i=0;i<e;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            adj.get(m).add(n);
            adj.get(n).add(m);
        }

        int[] vis = new int[v];
        int c=0;
        for(int i=0;i<v;i++){
            if(vis[i] == 0) {
                c++;
                bfs(adj, i, vis);
            }
        }

        System.out.println(c);
    }
}

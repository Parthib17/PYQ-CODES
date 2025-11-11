package Graph;

import java.util.*;

public class Dfs {

    public static List<Integer> dfs(int x,int[] vis, List<List<Integer>> adj, List<Integer> dfs){
        vis[x]=1;
        dfs.add(x);

        for(int elem : adj.get(x)){
            if(vis[elem] == 0){
                dfs(elem, vis, adj, dfs);
            }
        }
        return dfs;
    }


    public static void main(String[] args) {
        //adjacency list for undirected graph
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> dfs = new ArrayList<>();


        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();

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

        int[] vis = new int[adj.size()];

        vis[0]=1;
        //dfs.add(0);
        List<Integer> res = dfs(0,vis,adj,dfs);
        System.out.println(res);

//        System.out.println("Adjacency List:");
//        for (int i=0;i<v;i++){
//            System.out.print(i + " -> ");
//            for(Integer elem : adj.get(i)){
//                System.out.print(elem + " ");
//            }
//            System.out.println();
//        }

    }


}

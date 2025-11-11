package YEAR_2025.DATE_31_03_2025.Shift_2;

import java.util.*;

public class TowerRestorationBFS {

    public static int maxRestoredTowers(List<List<Integer>> adj, int[] cost,int i) {
        int n = adj.size();
        boolean[] restored = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int restoredCount = 0;

        // Let's assume Rani starts by restoring tower 0
        q.add(i);
        restored[i] = true;
        restoredCount++;

        // Simulate power spreading
        while (!q.isEmpty()) {
            int node = q.poll();
            int connections = adj.get(node).size();

            if (connections == 0) continue;

            // Power to distribute equally
            int powerPerNeighbor = cost[node] / connections;

            for (int nei : adj.get(node)) {
                if (!restored[nei] && powerPerNeighbor >= cost[nei]) {
                    restored[nei] = true;
                    q.add(nei);
                    restoredCount++;
                }
            }
        }

        return restoredCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of towers (vertices):");
        int v = sc.nextInt();

        System.out.println("Enter the restoration cost for each tower:");
        int[] cost = new int[v];
        for (int i = 0; i < v; i++) {
            cost[i] = sc.nextInt();
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the " + (v - 1) + " edges:");
        for (int i = 0; i < v - 1; i++) {
            int u = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            adj.get(u).add(w);
            adj.get(w).add(u);
        }

        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<v;i++){
            temp.add
                    (maxRestoredTowers(adj, cost, i));

        }
        int maxRestored = Collections.max(temp);
        System.out.println("Maximum number of towers Rani can restore: " + maxRestored);
    }
}

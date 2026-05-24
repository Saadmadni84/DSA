class Solution {

    public boolean dfs(int[][] graph, int src, int dest, boolean[] vis, int n) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int neighbor = 0; neighbor < n; neighbor++) {
            if (graph[src][neighbor] == 1 && !vis[neighbor]) {

                if (dfs(graph, neighbor, dest, vis, n)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        int[][] graph = new int[n][n];

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph[u][v] = 1;
            graph[v][u] = 1; 
        }
        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis, n);
    }
}

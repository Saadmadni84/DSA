public class dfsG {

    private boolean dfs(boolean[][] graph, int src, int dest, boolean[] vis, int n) {
        if (src == dest) return true;

        vis[src] = true;

        for (int i = 0; i < n; i++) {
            if (graph[src][i] == true && !vis[i]) {
                if (dfs(graph, i, dest, vis, n))
                    return true;
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[][] graph = new boolean[n][n];
        for (boolean[] row : graph)
            Arrays.fill(row, false);

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true;
        }

        boolean[] vis = new boolean[n];

        return dfs(graph, source, destination, vis, n);
    }
}

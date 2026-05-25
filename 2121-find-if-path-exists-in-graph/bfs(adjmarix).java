class Solution {

    public boolean validPath(int n,
                             int[][] edges,
                             int source,
                             int destination) {

        // Create adjacency matrix
        int[][] graph = new int[n][n];

        // Fill matrix
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph[u][v] = 1;
            graph[v][u] = 1; // undirected graph
        }

        // Visited array
        boolean[] vis = new boolean[n];

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from source
        queue.add(source);
        vis[source] = true;

        while (!queue.isEmpty()) {

            int curr = queue.poll();

            // Destination found
            if (curr == destination) {
                return true;
            }

            // Check all neighbors
            for (int neighbor = 0; neighbor < n; neighbor++) {

                // Edge exists and not visited
                if (graph[curr][neighbor] == 1 &&
                    !vis[neighbor]) {

                    queue.add(neighbor);
                    vis[neighbor] = true;
                }
            }
        }

        return false;
    }
}

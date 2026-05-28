class Solution {

    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        // 0 = uncolored
        // 1 = red
        // -1 = blue
        int[] color = new int[n];

        Queue<Integer> q = new LinkedList<>();

        // because graph may be disconnected
        for (int i = 0; i < n; i++) {

            // if node not colored
            if (color[i] == 0) {

                // start coloring
                color[i] = 1;

                q.offer(i);

                while (!q.isEmpty()) {

                    int node = q.poll();

                    // visit neighbors
                    for (int neighbor : graph[node]) {

                        // if uncolored
                        if (color[neighbor] == 0) {

                            // opposite color
                            color[neighbor] = -color[node];

                            q.offer(neighbor);
                        }

                        // same color found
                        else if (color[neighbor] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}

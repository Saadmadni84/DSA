class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] dist = new int[n][n];
        // Initialize with infinity
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        // Direct edges
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            dist[u - 1][v - 1] = w; // convert to 0-based indexing
        }
        // Diagonal = 0
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }
        // Floyd-Warshall
        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (dist[i][via] != Integer.MAX_VALUE &&
                        dist[via][j] != Integer.MAX_VALUE) {

                        dist[i][j] = Math.min(
                            dist[i][j],
                            dist[i][via] + dist[via][j]
                        );
                    }
                }
            }
        }

        int res = Integer.MIN_VALUE;

        // Distances from source k
        for (int i = 1; i <=n; i++) {
            if (dist[k - 1][i-1] == Integer.MAX_VALUE) {
                return -1; // unreachable node
            }

            res = Math.max(res, dist[k - 1][i-1]);
        }

        return res;
    }
}
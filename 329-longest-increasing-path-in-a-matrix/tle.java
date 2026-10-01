class Solution {
    int max = 1;

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean[][] vis = new boolean[n][m];
                dfs(i, j, matrix, vis, 1);
            }
        }

        return max;
    }

    private void dfs(int i, int j, int[][] m, boolean[][] vis, int c) {
        vis[i][j] = true;

        // Update max for the current path
        max = Math.max(max, c);

        int[][] d = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
        };

        for (int k = 0; k < 4; k++) {
            int newi = i + d[k][0];
            int newj = j + d[k][1];

            if (isSafe(m, newi, newj)
                    && !vis[newi][newj]
                    && m[newi][newj] > m[i][j]) {

                dfs(newi, newj, m, vis, c + 1);
            }
        }

        // Backtrack
        vis[i][j] = false;
    }

    private boolean isSafe(int[][] m, int i, int j) {
        if (i >= m.length || i < 0 || j >= m[0].length || j < 0) {
            return false;
        }

        return true;
    }
}

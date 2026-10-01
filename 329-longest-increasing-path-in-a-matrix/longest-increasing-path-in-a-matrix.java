class Solution {

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(i, j, matrix, dp));
            }
        }

        return ans;
    }

    private int dfs(int i, int j, int[][] matrix, int[][] dp) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int maxPath = 1;

        for (int[] dir : directions) {

            int ni = i + dir[0];
            int nj = j + dir[1];

            if (isSafe(matrix, ni, nj)
                    && matrix[ni][nj] > matrix[i][j]) {

                maxPath = Math.max(
                    maxPath,
                    1 + dfs(ni, nj, matrix, dp)
                );
            }
        }

        dp[i][j] = maxPath;

        return maxPath;
    }

    private boolean isSafe(int[][] matrix, int i, int j) {
        return i >= 0
                && i < matrix.length
                && j >= 0
                && j < matrix[0].length;
    }
}
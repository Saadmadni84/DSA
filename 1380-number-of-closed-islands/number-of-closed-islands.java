class Solution {

    private boolean isSafe(int i, int j, int n, int m) {
        return (i >= 0 && i < n && j >= 0 && j < m);
    }

    private void dfs(int i, int j, int n, int m, int[][] grid) {
        grid[i][j] = 1;  // mark visited

        int[][] dir = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        for (int k = 0; k < 4; k++) {
            int newi = i + dir[k][0];
            int newj = j + dir[k][1];

            if (isSafe(newi, newj, n, m) && grid[newi][newj] == 0) {
                dfs(newi, newj, n, m, grid);
            }
        }
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Step 1: Remove all islands touching border
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0) dfs(i, 0, n, m, grid);
            if (grid[i][m - 1] == 0) dfs(i, m - 1, n, m, grid);
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 0) dfs(0, j, n, m, grid);
            if (grid[n - 1][j] == 0) dfs(n - 1, j, n, m, grid);
        }

        // Step 2: Count the remaining closed islands
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    res++;
                    dfs(i, j, n, m, grid);
                }
            }
        }

        return res;
    }
}

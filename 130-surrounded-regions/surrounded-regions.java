class Solution {

    private boolean isSafe(int r, int c, int m, int n) {
        return r >= 0 && r < m && c >= 0 && c < n;
    }

    // DFS to mark all 'O' connected to (r, c)
    private void floodFill(int r, int c, int m, int n, char[][] board) {
        board[r][c] = 'V';   // mark as visited / safe

        int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };

        for (int k = 0; k < 4; k++) {
            int newr = r + dir[k][0];
            int newc = c + dir[k][1];

            if (isSafe(newr, newc, m, n) && board[newr][newc] == 'O') {
                floodFill(newr, newc, m, n, board);
            }
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int m = board.length;
        int n = board[0].length;

        // Step 1: From all borders, mark connected 'O' as 'V' (they are NOT surrounded)
        // Top & bottom rows
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                floodFill(0, j, m, n, board);
            }
            if (board[m - 1][j] == 'O') {
                floodFill(m - 1, j, m, n, board);
            }
        }

        // Left & right columns
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                floodFill(i, 0, m, n, board);
            }
            if (board[i][n - 1] == 'O') {
                floodFill(i, n - 1, m, n, board);
            }
        }

        // Step 2: Flip remaining 'O' to 'X' (these are surrounded)
        //         And flip 'V' (safe ones) back to 'O'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'V') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}

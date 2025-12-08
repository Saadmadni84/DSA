class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Push all initially rotten oranges to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) fresh++;
            }
        }

        if (fresh == 0) return 0;  // no fresh oranges present

        int minutes = -1;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int size = q.size();
            minutes++;

            // Process all oranges rotting at this minute
            for (int i = 0; i < size; i++) {
                int[] cur = q.remove();
                int r = cur[0], c = cur[1];

                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    // If valid fresh orange → rot it
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // rot
                        fresh--;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }

        // If some fresh oranges remain, impossible to rot all
        return (fresh == 0) ? minutes : -1;
    }
}

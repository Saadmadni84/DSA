import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j});
                    vis[i][j] = true;
                }
            }
        }

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty()) {

            int[] cell = q.poll();

            int r = cell[0];
            int c = cell[1];

            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    !vis[nr][nc]) {

                    dist[nr][nc] = dist[r][c] + 1;
                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(dist[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}
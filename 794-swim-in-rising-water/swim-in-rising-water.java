class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int low = grid[0][0];
        int high = n * n - 1;
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean[][] visited = new boolean[n][n];
            
            if (canReach(0, 0, mid, grid, visited)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    private boolean canReach(int r, int c, int t, int[][] grid, boolean[][] visited) {
        int n = grid.length;
        if (r == n - 1 && c == n - 1) return true;
        
        visited[r][c] = true;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc] && grid[nr][nc] <= t) {
                if (canReach(nr, nc, t, grid, visited)) return true;
            }
        }
        
        return false;
    }
}
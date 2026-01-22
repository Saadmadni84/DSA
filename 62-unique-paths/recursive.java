class Solution {
    public int uniquePaths(int m, int n) {
        // We use m-1 and n-1 because the grid is 0-indexed
        return helper(m - 1, n - 1);
    }

    private int helper(int r, int c) {
        // Base Case: Out of bounds
        if (r < 0 || c < 0) return 0;
        
        // Base Case: Reached the start
        if (r == 0 && c == 0) return 1;

        // Recursive Step: Sum of paths from top and left
        return helper(r - 1, c) + helper(r, c - 1);
    }
}

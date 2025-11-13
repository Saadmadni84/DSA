class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor == newColor) return image;

        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // boundary check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;

        // color mismatch → stop
        if (image[r][c] != originalColor) return;

        // change color
        image[r][c] = newColor;

        // explore 4 directions
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r, c + 1, originalColor, newColor); // right
        dfs(image, r, c - 1, originalColor, newColor); // left
    }
}

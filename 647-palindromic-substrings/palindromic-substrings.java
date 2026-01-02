class Solution {

    private boolean helper(String s, int i, int j, int[][] dp) {
        if (i > j) return false;
        if (i == j) {
            dp[i][j] = 1;
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        helper(s, i + 1, j, dp);
        helper(s, i, j - 1, dp);
        if (s.charAt(i) == s.charAt(j) &&
            (j == i + 1 || helper(s, i + 1, j - 1, dp))) {
            dp[i][j] = 1;
            return true;
        }
        dp[i][j] = 0;
        return false;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        helper(s, 0, n - 1, dp);
        int res = 0;
        for (int l = 1; l <=n; l++) {
            for (int i = 0; i <=n-l; i++) {
                int j=i+l-1;
                if (dp[i][j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}

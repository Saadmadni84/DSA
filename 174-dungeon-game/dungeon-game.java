class Solution {
    public int calculateMinimumHP(int[][] d) {
        int n=d.length;
        int m=d[0].length;
        int [][] dp=new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[n-1][m]=1;
        dp[n][m-1]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int min=Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i][j] = Math.max(1, min - d[i][j]);
            }
        }
        return dp[0][0];

    }
}
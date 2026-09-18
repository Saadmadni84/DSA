class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
       if(n==1){
        return 0;
       } 
       int[][] dp = new int[p.length][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return dfs(0,1,dp,p);     
    }
    private int dfs(int i,int status,int [][] dp,int [] p){
        if(i>=p.length){
            return 0;
        }
        if(dp[i][status]!=-1){
            return dp[i][status];
        }
        int skip=dfs(i+1,status,dp,p);
        if(status==1){
            int buy=dfs(i+1,0,dp,p)-p[i];
            dp[i][status]=Math.max(buy,skip);
        }
        else{
           int sell = dfs(i + 2, 1, dp, p) + p[i];
            dp[i][status] = Math.max(sell, skip);
        }
        return dp[i][status];
    }
}
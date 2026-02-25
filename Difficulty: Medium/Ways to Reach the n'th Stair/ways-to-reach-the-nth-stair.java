class Solution {
    int countWays(int n) {
     if(n<0) return 0;
        if(n==0) return 1;
        int [] dp=new int[n+1];
        java.util.Arrays.fill(dp, -1);
        return helper(dp,n);
    }
    private int helper(int [] dp,int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(dp,n-1)+helper(dp,n-2);
        return dp[n];
    }
}  
    
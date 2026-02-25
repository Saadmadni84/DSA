class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int [] dp=new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return helper(dp,n);
    }
    private int helper(int [] dp,int n){
         if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(dp,n-1)+helper(dp,n-2)+helper(dp,n-3);

        return dp[n];
    }
}
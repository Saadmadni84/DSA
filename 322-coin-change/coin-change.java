class Solution {
    public int coinChange(int[] coins, int a) {
       if(a<1){
        return 0;
       }
       int [] dp=new int[a+1];
       dp[0]=0;
       for(int i=1;i<=a;i++){
           dp[i]=Integer.MAX_VALUE;
           for(int coin:coins){
            if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE){
                dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
           }
       }
       if(dp[a]==Integer.MAX_VALUE){
        return -1;
       }
       return dp[a];
    }
}
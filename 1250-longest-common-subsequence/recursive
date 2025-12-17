class Solution {
    private int helper(String t1,String t2,int i,int j,int [][] dp){
        if(i>=t1.length() || j>=t2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j]= 1+helper(t1,t2,i+1,j+1,dp);
        }
        return dp[i][j]= Math.max(helper(t1,t2,i+1,j,dp),helper(t1,t2,i,j+1,dp));
    }
    public int longestCommonSubsequence(String t1, String t2) {
       int n=t1.length(), m=t2.length();
       int [][] dp=new int[n][m];
       for(int [] row:dp){
        Arrays.fill(row,-1);
       }
       return helper(t1,t2,0,0,dp);
    }
}

class Solution {
    private int helper(String s, String p,int i,int j,int [][] dp){
        if(s.length()==i && p.length()==j){
            return 1;
        }
        if(p.length()==j){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.length()==i){
            if(p.charAt(j)=='*'){
               return dp[i][j]=helper(s,p,i,j+1,dp);
            }
            return dp[i][j]=0;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
           return dp[i][j]= helper(s,p,i+1,j+1,dp);
        }
        if(p.charAt(j)=='*'){
           return dp[i][j]= (helper(s,p,i,j+1,dp)==1|| helper(s,p,i+1,j,dp)==1)?1:0;
        }
        return dp[i][j]=0;
    }
    public boolean isMatch(String s, String p) {
     int [][] dp=new int[s.length()+1][p.length()+1] ;
     for(int []row:dp){
        Arrays.fill(row,-1);
     }  
     return helper(s, p, 0, 0, dp) == 1;
    }
}
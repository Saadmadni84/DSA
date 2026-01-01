class Solution {
    boolean helper(String s, String p,int i,int j,Boolean [][] dp){
        if(i<0 && j<0){
            return true;
        }
        if(j<0){
            return false;
        }
        boolean ans;
        if(i<0){
            if (p.charAt(j) == '*') {
                ans=helper(s, p, i, j - 2,dp);
            }
            else{
            ans=false;
            }
            dp[i + 1][j + 1] = ans;
            return ans;
        }
        if(dp[i+1][j+1]!=null){
            return dp[i+1][j+1];
        }
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            ans = helper(s, p, i - 1, j - 1, dp);
        } else if (p.charAt(j) == '*') {
            ans = helper(s, p, i, j - 2, dp) ||
                  ((s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') &&
                   helper(s, p, i - 1, j, dp));
        } else {
            ans = false;
        }

        dp[i + 1][j + 1] = ans;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        int i=s.length();
        int j=p.length();
        Boolean [][] dp =new Boolean [i+1][j+1];
     return helper(s, p,i-1,j-1,dp);   
    }
}
class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
        boolean [][] dp = new boolean[n][n];
        String res="";
        for (int l = 1; l <=n; l++) {
            for (int i = 0; i <=n-l; i++) {
                int j=i+l-1;
                if(i==j){
                    dp[i][j]=true;
                }
                else if(j==i+1){
                   dp[i][j]=(s.charAt(i)==s.charAt(j));
                }
                else if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }
                else  {
                    dp[i][j]=false;
                }
                if(dp[i][j]){
                    res=s.substring(i,j+1);
                }
            }
        }
      return res;
    }
}
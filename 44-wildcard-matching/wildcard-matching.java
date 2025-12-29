class Solution {
     public boolean isMatch(String s, String p) {
       int n=s.length();
       int m=p.length();
       boolean [] prev=new boolean[m+1];
        boolean [] curr=new boolean[m+1];
        prev[0]=true;
          curr[0] = false;
       for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                prev[j] = prev[j - 1];  
            } else {
                prev[j] = false;
            }
        }
       for(int i=1;i<=n;i++){
      
         for (int j=1;j<=m;j++){
            if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                curr[j]=prev[j-1];
            }
            else if(p.charAt(j-1)=='*'){
                curr[j]=prev[j] || curr[j-1];
            }
            else{
                curr[j]=false;
            }
         }
         prev=curr.clone();
       }
       return prev[m];
    }
}
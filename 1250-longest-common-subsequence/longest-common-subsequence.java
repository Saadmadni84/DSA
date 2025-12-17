class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
       int n=t1.length(), m=t2.length();
       int [] prev=new int[m+1];
       int [] curr=new int [m+1];
       for(int i=0;i<m;i++){
        prev[i]=0;
       }
       curr[0]=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(t1.charAt(i-1)==t2.charAt(j-1)){
                curr[j]=1+prev[j-1];
            }
            else{
                curr[j]=Math.max(curr[j-1],prev[j]);
            }
        }
        prev=(int [])(curr.clone());
       }
       return curr[m];
    }
}
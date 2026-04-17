// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        int [] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
       return helper(arr,0,dp);
        
    }
    private int helper(int arr[],int i,int [] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int p=helper(arr,i+2,dp)+arr[i];
        int np=helper(arr,i+1,dp);
        dp[i]= Math.max(p,np);
        return dp[i];
    }
}
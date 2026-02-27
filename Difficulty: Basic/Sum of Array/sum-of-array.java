// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
      return helper(arr,0,0);
        
    }
    private int helper(int [] arr,int i,int sum){
        if(i>=arr.length){
          return sum;
      }
      return helper(arr,i+1,arr[i]+sum);
      
    }
}

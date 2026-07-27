class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
      return helper(0,arr,k);
    }
    private boolean helper(int i,int [] arr,int k){
        if(k==0){
            return true ;
        }
          if (k < 0 || i == arr.length) return false;
          
        return helper(i+1,arr,k-arr[i]) || helper(i+1,arr,k);
    }
   
}
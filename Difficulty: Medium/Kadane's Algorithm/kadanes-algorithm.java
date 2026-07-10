class Solution {
    int maxSubarraySum(int[] arr) {
      int maxs=arr[0];
      int csum=0;
      for(int i=0;i<arr.length;i++){
          csum=csum+arr[i];
          if(csum>maxs){
              maxs=csum;
          }
          if(csum<0){
              csum=0;
          }
      }
      return maxs;
        
    }
}

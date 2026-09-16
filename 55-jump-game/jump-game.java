class Solution {
    public boolean canJump(int[] arr) {
       int n=arr.length;
       int max=arr[0];
       for(int i=1;i<n;i++){
        if(i>max){
            return false;
        }
        if(arr[i]+i>max){
            max=arr[i]+i;
        }
        if(max>=n-1){
            return true;
        }

       }
      return true;
    }
}
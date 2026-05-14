class Solution {
    public boolean isGood(int[] nums) {
      int n=nums.length;
      if(n==1 && nums[0]!=0){
        return false;
      }
      Arrays.sort(nums);
      int j=1;
      for(int i=0;i<n;i++){
        if(nums[i]!=j){
            return false;
        }
        else if(nums[i]==j && j<n-1){
          j++;
        }
      } 
      return true;
    }
}
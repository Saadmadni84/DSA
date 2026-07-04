class Solution {
    public int pivotIndex(int[] nums) {
      int total=0;
      for(int num:nums){
        total+=num;
      }
      int l=0;
      int r=0;
      for(int i=0;i<nums.length;i++){
        r=total-l-nums[i];
        if(r==l){
            return i;
        }
        l=l+nums[i];
      }
      return -1;
    }
}
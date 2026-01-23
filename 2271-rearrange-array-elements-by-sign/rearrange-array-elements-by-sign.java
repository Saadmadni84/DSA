class Solution {
    public int[] rearrangeArray(int[] nums) {
     int [] ans=new int[nums.length];
      int k=0;
      int l=1;
     for(int i=0;i<nums.length;i++){
          if(nums[i]>=0){
             ans[k]=nums[i];
             k=k+2;
          }
          else{
           ans[l]=nums[i];
            l=l+2;
          }
     }
     return ans;
    }
}
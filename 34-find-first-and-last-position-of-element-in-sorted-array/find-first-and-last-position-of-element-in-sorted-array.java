class Solution {
    public int[] searchRange(int[] nums, int target) {
      int [] res={-1,-1};
        int l=0,h=nums.length-1,m=0;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target){
                res[0]=m;
                h=m-1;
            }
            else if(nums[m]>target){
                h=m-1;
            }
            else{
               l=m+1;
            }
        }
        l=0;
        h=nums.length-1;
        m=0;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target){
                res[1]=m;
                l=m+1;
            }
            else if(nums[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
}
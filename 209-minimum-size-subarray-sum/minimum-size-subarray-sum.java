class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int sum=0;
        while(r<n){
            sum=sum+nums[r];
            while(sum>=target){
                min=Math.min(r-l+1,min);
                sum=sum-nums[l];
                l++;
                
            }
            r++;
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }
}
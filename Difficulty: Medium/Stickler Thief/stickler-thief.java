class Solution {
    public int findMaxSum(int nums[]) {
      int [] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
       return helper(nums,0,dp);
    }
    private int helper(int[] nums, int i,int [] dp) {
        if (i >=nums.length) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = nums[i] + helper(nums, i+2,dp);
        int dontPick = helper(nums, i +1,dp);
       dp[i]= Math.max(pick, dontPick);
       return dp[i];
    }
}
        

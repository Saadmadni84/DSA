class Solution {
    public int rob(int[] nums) {
        return helper(nums, nums.length - 1);
    }

    private int helper(int[] nums, int i) {
        // Base Case: No more houses to rob
        if (i < 0) return 0;
        
        // Choice 1: Rob current house + houses before the neighbor
        int pick = nums[i] + helper(nums, i - 2);
        
        // Choice 2: Skip current house and see what we get from the neighbor
        int dontPick = helper(nums, i - 1);

        // Return the better of the two options
        return Math.max(pick, dontPick);
    }
}

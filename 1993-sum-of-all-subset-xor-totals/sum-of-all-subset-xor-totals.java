class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int i, int currentXor) {
        if (i == nums.length) {
            return currentXor;
        }
        int pick = helper(nums, i + 1, currentXor ^ nums[i]);
        int dontPick = helper(nums, i + 1, currentXor);
        return pick + dontPick;
    }
}
class Solution {

    private boolean helper(int[] nums, int target, int i, Boolean[][] dp) {

        if (target == 0) return true;
        if (i == nums.length || target < 0) return false;

        if (dp[i][target] != null) {
            return dp[i][target];
        }

        boolean take = helper(nums, target - nums[i], i + 1, dp);
        boolean notTake = helper(nums, target, i + 1, dp);

        return dp[i][target] = take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return helper(nums, target, 0, dp);
    }
}

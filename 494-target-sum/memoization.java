class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return helper(nums, 0, 0, target, memo);
    }

    private int helper(int[] nums, int i, int currentSum, int target, Map<String, Integer> memo) {
        if (i == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        String key = i + "," + currentSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int add = helper(nums, i + 1, currentSum + nums[i], target, memo);
        int subtract = helper(nums, i + 1, currentSum - nums[i], target, memo);

        int ways = add + subtract;
        memo.put(key, ways);
        return ways;
    }
}

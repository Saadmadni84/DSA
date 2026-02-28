import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  
        int[] memo1 = new int[n];
        Arrays.fill(memo1, -1);
        int planA = helper(nums, 0, n - 2, memo1);
        
        int[] memo2 = new int[n];
        Arrays.fill(memo2, -1);
        int planB = helper(nums, 1, n - 1, memo2);
        
        return Math.max(planA, planB);
    }

    private int helper(int[] nums, int i, int end, int[] memo) {
        if (i > end) return 0;
        
        if (memo[i] != -1) return memo[i];
        int pick = nums[i] + helper(nums, i + 2, end, memo);
        int dontPick = helper(nums, i + 1, end, memo);
        
        return memo[i] = Math.max(pick, dontPick);
    }
}
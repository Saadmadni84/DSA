import java.util.*;

class Solution {
    public int solveWordWrap(int[] nums, int k) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return findMinCost(0, nums, k, memo);
    }

    private int findMinCost(int i, int[] nums, int k, int[] memo) {
        if (i >= nums.length) return 0;
        
        if (memo[i] != -1) return memo[i];

        int minCost = Integer.MAX_VALUE;
        int currentLength = 0;

        for (int j = i; j < nums.length; j++) {
            currentLength += nums[j];
            if (j > i) currentLength++;

            if (currentLength <= k) {
                int cost;
                if (j == nums.length - 1) {
                    cost = 0;
                } else {
                    int remaining = k - currentLength;
                    int subProblemCost = findMinCost(j + 1, nums, k, memo);
                    cost = (remaining * remaining) + subProblemCost;
                }
                minCost = Math.min(minCost, cost);
            } else {
                break;
            }
        }

        return memo[i] = minCost;
    }
}
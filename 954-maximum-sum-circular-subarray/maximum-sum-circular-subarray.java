class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int max_kadane = Integer.MIN_VALUE;
        int currentMax = 0;
        int min_kadane = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int x : nums) {
            totalSum += x;
            currentMax = Math.max(x, currentMax + x);
            max_kadane = Math.max(max_kadane, currentMax);
            
            currentMin = Math.min(x, currentMin + x);
            min_kadane = Math.min(min_kadane, currentMin);
        }
        if (max_kadane < 0) {
            return max_kadane;
        }

        return Math.max(max_kadane, totalSum - min_kadane);
    }
}
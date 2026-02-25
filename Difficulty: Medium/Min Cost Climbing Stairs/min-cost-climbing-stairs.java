//Back-end complete function Template for Java

class Solution {
     
    static int minCostClimbingStairs(int[] cost) {
         int [] memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(helper(cost, 0,memo), helper(cost, 1,memo));
    }

    private static int helper(int[] cost, int i,int [] m) {
        if (i >= cost.length) {
            return 0;
        }

        if (m[i] != -1) {
            return m[i];
        }
        m[i] = cost[i] + Math.min(helper(cost, i + 1,m), helper(cost, i + 2,m));
        
        return m[i];
    }
}
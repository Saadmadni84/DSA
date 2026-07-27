
class Solution {
    int[] memo; 
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(helper(cost, 0), helper(cost, 1));
    }

    private int helper(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }
        int p=helper(cost, i + 1)+cost[i];
        int pp=helper(cost, i + 2)+cost[i];
        memo[i] = Math.min(p,pp);
        
        return memo[i];
    }
}
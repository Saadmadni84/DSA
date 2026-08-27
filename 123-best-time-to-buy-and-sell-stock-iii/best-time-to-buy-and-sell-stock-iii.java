
class Solution {
    private int[][][] memo;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        memo = new int[n][2][3];
        
     
        for (int[][] page : memo) {
            for (int[] row : page) {
                Arrays.fill(row, -1);
            }
        }

        return solve(0, 1, 2, prices);
    }

    private int solve(int index, int buy, int limit, int[] prices) {
       
        if (index == prices.length || limit == 0) {
            return 0;
        }
        if (memo[index][buy][limit] != -1) {
            return memo[index][buy][limit];
        }

        int profit = 0;

        if (buy == 1) {
         
            int skip = solve(index + 1, 1, limit, prices);
          
            int take = -prices[index] + solve(index + 1, 0, limit, prices);
            
            profit = Math.max(skip, take);
        } else {
           
            int skip = solve(index + 1, 0, limit, prices);
            int take = prices[index] + solve(index + 1, 1, limit - 1, prices);
            
            profit = Math.max(skip, take);
        }
        return memo[index][buy][limit] = profit;
    }
}
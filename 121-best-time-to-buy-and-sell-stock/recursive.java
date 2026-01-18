class Solution {

    public int maxProfit(int[] prices) {
        return solve(prices, 0, Integer.MAX_VALUE);
    }

    private int solve(int[] prices, int index, int minPrice) {
        if (index == prices.length) {
            return 0;
        }

        minPrice = Math.min(minPrice, prices[index]);

        int sellToday = prices[index] - minPrice;
        int skip = solve(prices, index + 1, minPrice);

        return Math.max(sellToday, skip);
    }
}

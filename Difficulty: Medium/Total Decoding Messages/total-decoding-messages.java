class Solution {
    public int countWays(String d) {
        int[] memo = new int[d.length()];
        java.util.Arrays.fill(memo, -1);
        
        return helper(d, 0, memo);
    }

    private int helper(String d, int i, int[] memo) {
        if (i == d.length()) {
            return 1;
        }
        if (d.charAt(i) == '0') return 0;
        if (memo[i] != -1) return memo[i];
        int res = helper(d, i + 1, memo);
        if (i + 1 < d.length()) {
            int n = (d.charAt(i) - '0') * 10 + (d.charAt(i + 1) - '0');
            if (n >= 10 && n <= 26) {
                res = res + helper(d, i + 2, memo);
            }
        }
        return memo[i] = res;
    }
}
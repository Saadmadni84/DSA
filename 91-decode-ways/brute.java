class Solution {

    public int numDecodings(String s) {
        return helper(s, 0);
    }

    private int helper(String s, int index) {

        // Reached end → one valid way
        if (index == s.length()) {
            return 1;
        }

        // Starts with 0 → invalid
        if (s.charAt(index) == '0') {
            return 0;
        }

        // Take single digit
        int ways = helper(s, index + 1);

        // Take two digits if valid
        if (index + 1 < s.length()) {
            int num = (s.charAt(index) - '0') * 10 + (s.charAt(index + 1) - '0');
            if (num >= 10 && num <= 26) {
                ways += helper(s, index + 2);
            }
        }

        return ways;
    }
}

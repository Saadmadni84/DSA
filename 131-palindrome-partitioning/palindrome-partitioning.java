import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {
        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (i == j) {
                    dp[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j)) {
                    if (j == i + 1 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
            }
        }

        List<List<String>> res = new ArrayList<>();
        backtrack(0, s, dp, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(
            int index,
            String s,
            boolean[][] dp,
            List<String> current,
            List<List<String>> result
    ) {
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (dp[index][i]) {
                current.add(s.substring(index, i + 1));
                backtrack(i + 1, s, dp, current, result);
                current.remove(current.size() - 1); 
            }
        }
    }
}

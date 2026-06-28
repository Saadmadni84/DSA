class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        for (int i = 0; i < n; i++) {
            int[] hash = new int[256];
            int cnt = 0;

            for (int j = 0; j < m; j++) {
                hash[t.charAt(j)]++;
            }

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] > 0) {
                    cnt++;
                }
                hash[s.charAt(j)]--;

                if (cnt == m) {
                    if (j - i + 1 < minLen) {
                        minLen = j - i + 1;
                        startIndex = i;
                    }
                    break;
                }
            }
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n == 0 || m == 0 || n < m) return "";

        int[] hash = new int[256];
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int l = 0, r = 0, cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (r < n) {
            if (hash[s.charAt(r)] > 0) {
                cnt++;
            }
            hash[s.charAt(r)]--;

            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }

                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
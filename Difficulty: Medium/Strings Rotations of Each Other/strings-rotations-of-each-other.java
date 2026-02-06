class Solution {
    public boolean areRotations(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String text = s + s;
        return kmpSearch(text, goal);
    }

    private boolean kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPS(pattern);
        
        int i = 0; // index for text
        int j = 0; // index for pattern
        
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) return true; // Found the pattern!
            
            else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) j = lps[j - 1]; // Use LPS to skip checks
                else i++;
            }
        }
        return false;
    }

    private int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
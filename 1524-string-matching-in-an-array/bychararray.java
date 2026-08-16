import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            char[] sub = words[i].toCharArray();

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                char[] main = words[j].toCharArray();

                // Check if 'sub' is a substring of 'main'
                if (isSubstring(sub, main)) {
                    result.add(words[i]);
                    break; // Found a match, move to the next candidate word
                }
            }
        }

        return result;
    }

    private boolean isSubstring(char[] sub, char[] main) {
        if (sub.length > main.length) return false;

        // Slide 'sub' over 'main'
        for (int i = 0; i <= main.length - sub.length; i++) {
            boolean match = true;
            for (int j = 0; j < sub.length; j++) {
                if (main[i + j] != sub[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }

        return false;
    }
}

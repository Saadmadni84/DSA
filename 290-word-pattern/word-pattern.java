import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String p, String s) {
        Map<Character, String> m = new HashMap<>();
        String[] w = s.split("\\s+");
        if (p.length() != w.length) {
            return false;
        }
        
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            String word = w[i];
            if (m.containsKey(c)) {
                if (!m.get(c).equals(word)) {
                    return false; 
                }
            } else {
                if (m.containsValue(word)) {
                    return false; 
                }
                m.put(c, word);
            }
        }
        return true;
    }
}
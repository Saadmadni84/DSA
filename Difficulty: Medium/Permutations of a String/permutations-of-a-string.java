import java.util.*;

class Solution {
    public ArrayList<String> findPermutation(String s) {
        Set<String> resultSet = new HashSet<>();
        char[] chars = s.toCharArray();
        
        helper(0, chars, resultSet);
        
        ArrayList<String> res = new ArrayList<>(resultSet);
        Collections.sort(res);
        return res;
    }

    private void helper(int index, char[] chars, Set<String> res) {
        if (index == chars.length) {
            res.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            
            swap(chars, index, i);
            helper(index + 1, chars, res);
            swap(chars, index, i);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
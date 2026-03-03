import java.util.*;

class Solution {
    
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        
        backtrack(digits, used, 0, 0, set);
        
        return set.size();
    }
    
    private void backtrack(int[] digits, boolean[] used, 
                           int currentNumber, int length, 
                           Set<Integer> set) {
        
      
        if (length == 3) {
            if (currentNumber % 2 == 0) {  
                set.add(currentNumber);
            }
            return;
        }
        
        for (int i = 0; i < digits.length; i++) {
            
            if (used[i]) continue;  
            
         
            if (length == 0 && digits[i] == 0) continue;
            
            used[i] = true;
            
            backtrack(digits, used,
                      currentNumber * 10 + digits[i],
                      length + 1,
                      set);
            
            used[i] = false; 
        }
    }
}
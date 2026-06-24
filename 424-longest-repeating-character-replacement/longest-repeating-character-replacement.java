class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // To store frequency of uppercase English letters
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Update the frequency of the incoming character
            counts[s.charAt(right) - 'A']++;
            
            // Track the highest frequency of any single character seen in the current window
            maxFrequency = Math.max(maxFrequency, counts[s.charAt(right) - 'A']);
            
            // If the remaining characters to replace exceed k, shrink the window from the left
            int currentWindowLength = right - left + 1;
            if (currentWindowLength - maxFrequency > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
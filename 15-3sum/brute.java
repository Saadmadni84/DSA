import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // HashSet to automatically filter out duplicate triplets
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        int n = nums.length;
        
        // Loop 1: Fixes the first element
        for (int i = 0; i < n - 2; i++) {
            // Loop 2: Fixes the second element
            for (int j = i + 1; j < n - 1; j++) {
                // Loop 3: Fixes the third element
                for (int k = j + 1; k < n; k++) {
                    
                    // Check if the three elements add up to 0
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        
                        // Sort the individual triplet so the HashSet can recognize duplicates
                        Collections.sort(triplet);
                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }
        
        // Convert the Set back into a List to match LeetCode's return type
        return new ArrayList<>(uniqueTriplets);
    }
}

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        for (int s = 0; s < n; s++) {
            boolean isSorted = true;   
            for (int i = 0; i < n - 1; i++) {
                int current = nums[(s + i) % n];
                int next = nums[(s + i + 1) % n];
                
                if (current > next) {
                    isSorted = false;
                    break;
                }
            }
            
            if (isSorted) return true;
        }
        
        return false;
    }
}
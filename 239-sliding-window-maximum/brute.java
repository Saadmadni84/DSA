class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            ls.add(max);
        }
        
        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}

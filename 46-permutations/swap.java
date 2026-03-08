class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, res);
        return res;
    }

    private void helper(int start, int[] nums, List<List<Integer>> res) {
        // Base case: If we've reached the end of the array, we found a permutation
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            res.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // 1. SWAP: Move the element at i to the current 'start' position
            swap(nums, start, i);

            // 2. RECURSE: Fix the next position
            helper(start + 1, nums, res);

            // 3. BACKTRACK: Swap back to restore the original array state
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

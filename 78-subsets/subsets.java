class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int i, List<Integer> current, List<List<Integer>> result) {
        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        generateSubsets(nums, i + 1, current, result);
        current.remove(current.size() - 1);
        generateSubsets(nums, i + 1, current, result);
    }
}
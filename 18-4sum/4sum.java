class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, target, 0, new ArrayList<>(), ls);
        return ls;
    }

    public void helper(int[] a, int start, int target, long sum,
                       List<Integer> curr, List<List<Integer>> ls) {

        if (curr.size() == 4) {
            if (sum == target) {
                ls.add(new ArrayList<>(curr));
            }
            return;
        }

        for (int i = start; i < a.length; i++) {

            if (i > start && a[i] == a[i - 1]) continue;

            if (sum + a[i] > target && a[i] >= 0) break;

            curr.add(a[i]);
            helper(a, i + 1, target, sum + a[i], curr, ls);
            curr.remove(curr.size() - 1);
        }
    }
}
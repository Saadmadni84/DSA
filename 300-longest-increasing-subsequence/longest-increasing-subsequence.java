class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > sub.get(sub.size() - 1)) {
                sub.add(num);
            } else {
                int left = 0;
                int right = sub.size() - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (sub.get(mid) < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                sub.set(left, num);
            }
        }
        return sub.size();
    }
}
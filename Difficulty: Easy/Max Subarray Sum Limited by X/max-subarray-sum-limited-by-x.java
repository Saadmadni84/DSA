class Solution {
    public int maxSum(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, maxsum = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            while (sum > k && l <= r) {
                sum = sum - arr[l];
                l++;
            }
            if (sum <= k) {
                maxsum = Math.max(maxsum, sum);
            }
            r++;
        }
        return maxsum;
    }
}
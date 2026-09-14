class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        Boolean[][] dp = new Boolean[arr.length][sum + 1];
        return helper(arr, sum, 0, dp);
    }

    private static boolean helper(int[] arr, int sum, int i, Boolean[][] dp) {
        if (sum == 0) return true;
        if (i >= arr.length || sum < 0) return false;

        if (dp[i][sum] != null) return dp[i][sum];

        boolean pick = false;
        if (sum >= arr[i]) {
            pick = helper(arr, sum - arr[i], i + 1, dp);
        }

     
        boolean notPick = helper(arr, sum, i + 1, dp);

        return dp[i][sum] = pick || notPick;
    }
}
class Solution {
    public boolean isGoodArray(int[] nums) {
        int runningGcd = nums[0];
        
        for (int num : nums) {
            runningGcd = gcd(runningGcd, num);
            if (runningGcd == 1) {
                return true;
            }
        }
        
        return runningGcd == 1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
// User function Template for Java

class Solution {
    public static int[] fibonacciNumbers(int n) {
        int[] result = new int[n];
        if (n >= 1) result[0] = 0;
        if (n >= 2) result[1] = 1;
        fillFib(result, 2, n);
        return result;
    }

    private static void fillFib(int[] arr, int i, int n) {
        if (i >= n) {
            return;
        }
        arr[i] = arr[i - 1] + arr[i - 2];
        
        fillFib(arr, i + 1, n);
    }
}
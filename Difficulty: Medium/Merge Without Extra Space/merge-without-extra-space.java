import java.util.*;

class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right < n) {
                    if (a[left] > a[right]) swap(a, left, a, right);
                } 
                else if (left < n && right >= n) {
                    if (a[left] > b[right - n]) swap(a, left, b, right - n);
                } 
                else {
                    if (b[left - n] > b[right - n]) swap(b, left - n, b, right - n);
                }
                left++;
                right++;
            }
            
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    private void swap(int[] arr1, int i, int[] arr2, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
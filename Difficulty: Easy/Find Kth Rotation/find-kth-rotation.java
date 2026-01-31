class Solution {
    
public int findKRotation(int arr[]) {
    int left = 0, right = arr.length - 1;
    int minIndex = 0;
    
    while (left <= right) {
        if (arr[left] <= arr[right]) {
            if (arr[left] < arr[minIndex]) {
                minIndex = left;
            }
            break;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] < arr[minIndex]) {
            minIndex = mid;
        }
        
        if (arr[mid] >= arr[left]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return minIndex;
}
}
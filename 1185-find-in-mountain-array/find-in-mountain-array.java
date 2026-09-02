/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak=0;
        int l= 0, h = arr.length() - 1;
        while (l< h) {
            int m = l+ (h - l) / 2;
            if (arr.get(m) < arr.get(m+1)) {
                l = m + 1; 
            } else {
                h = m;   
            }
        }
      
        int pvi=l;
        peak=arr.get(l);
        l=0;
         h = pvi-1;
        while (l <= h) {
            int m = l+ (h - l) / 2;
            if (arr.get(m) == target) return m;
            if (arr.get(m) < target) l = m+ 1;
            else h = m - 1;
        }
         l=pvi;
         h = arr.length() - 1;
        while (l <= h) {
           int m = l+ (h - l) / 2;
           if (arr.get(m) == target) return m;
            if (arr.get(m) >target) l = m+ 1;
             else h = m - 1;
        }
        return -1;
    }
}
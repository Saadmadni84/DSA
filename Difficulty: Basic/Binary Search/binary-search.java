class Solution {
    public boolean binarySearch(int[] arr, int k) {
     int l=0;
     int r=arr.length-1;
     while(l<=r){
         int m=(l+r)/2;
         if(arr[m]==k){
             return true;
         }
         else if(arr[m]>k){
             r--;
         }
         else{
             l++;
         }
     }
     return false;
        
    }
}
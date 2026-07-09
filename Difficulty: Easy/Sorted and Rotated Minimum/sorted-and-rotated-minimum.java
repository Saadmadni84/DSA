class Solution {
    public int findMin(int[] arr) {
     int l=0;
     int r=arr.length-1;
     while(l<r){
         int m=(l+r)/2;
         if(arr[m]>arr[r]){
            l=m+1; 
         }
         else{
             r=m;
         }
     }
     return arr[l];
        
    }
}

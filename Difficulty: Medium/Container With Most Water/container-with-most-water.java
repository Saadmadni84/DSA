class Solution {
    public int maxWater(int arr[]) {
       int i=0;
       int j=arr.length-1;
       int max=0;
       while(i<j){
          int m=Math.min(arr[i],arr[j]);
          max=Math.max(max,m*(j-i));
          if(arr[i]<arr[j]){
              i++;
          }
          else{
              j--;
          }
       }
       return max;
        
    }
}
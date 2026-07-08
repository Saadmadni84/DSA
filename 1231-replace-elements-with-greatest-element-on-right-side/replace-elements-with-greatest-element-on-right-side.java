class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
       
        if(n==1){
            arr[0]=-1;
            return arr;
        }
      for(int i=0;i<n;i++){
         int max=-1;
        for(int j=i+1;j<n;j++){
            max=Math.max(arr[j],max);
            
        }
        if(i==n-1){
            arr[i]=-1;
        }
        arr[i]=max;
      }
      return arr;

    }
}
class Solution {
    public int jump(int[] arr) {
      int n=arr.length;
      if (n <= 1) return 0;
      int max=0;
      int c=0;
      int currentc=0;

      for(int i=0;i<n;i++){
        if(i>max){
            return -1;
        }
        if(max<arr[i]+i){
            max=arr[i]+i;
        }
        if(i==currentc){
            c++;
            currentc=max;
            if(currentc>=n-1){
                return c;
            }
        }
      }
      return c;
    }
}
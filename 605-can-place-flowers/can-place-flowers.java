class Solution {
    public boolean canPlaceFlowers(int[] f , int n) {
        if (f.length == 1) {
            if (f[0] == 0) n--;
            return n <= 0;
        }
       int i=0;
       if(f[i]==0 && f[i+1]==0){
          n--;
          f[i]=1;
       }
       i++;
       for(i=1;i<f.length-1;i++){
        if(f[i]==0 && f[i-1]==0 && f[i+1]==0){
            n--;
            f[i]=1;
        }
       }
       if(f[i]==0 && f[i-1]==0){
          n--;
       }
       return n<=0;

    }
}
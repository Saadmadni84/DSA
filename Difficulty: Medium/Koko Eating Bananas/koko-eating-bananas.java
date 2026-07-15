class Solution {
    public int kokoEat(int[] arr, int k) {
       int l=1;
       int r=0;
       for(int a:arr){
           r=Math.max(a,r);
       }
       int res=r;
       while(l<=r){
           int m=(l+r)/2;
           if(cando(arr,k,m)){
               res=m;
               r=m-1;
           }
           else{
               l=m+1;
           }
       }
       
       return res;
        
    }
    private boolean cando(int [] arr,int k,int min){
           long time=0;
           for(int a:arr){
               time+=(a+min-1L)/min;
           }
           return time<=k;
       }
}

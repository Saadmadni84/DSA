class Solution {
    public int maxCircularSum(int arr[]) {
      int tt=0;
      int maxk=Integer.MIN_VALUE;
      int cmax=0;
      int mink=Integer.MAX_VALUE;
      int cmin=0;
      for(int x:arr){
       tt+=x;
       cmax=Math.max(x,cmax+x);
       maxk=Math.max(cmax,maxk);
       
       cmin=Math.min(x,cmin+x);
       mink=Math.min(cmin,mink);
      }
       if(maxk<0){
           return maxk;
       }
       
      
       return Math.max(maxk,tt-mink) ;
    }
}

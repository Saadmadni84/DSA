class Solution {
    public int buyChoco(int[] p, int m) {
      int m1=Integer.MAX_VALUE;
      int m2=Integer.MAX_VALUE;

      for(int pr:p){
        if(pr<m1){
            m2=m1;
            m1=pr;
        }
        else if(pr<m2){
            m2=pr;
        }
      }
       int sum=m-m1-m2;
       if(sum<0){
        return m;
       }
       return sum;
    }
}
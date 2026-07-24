class Solution {
    public int divide(int d, int divisor) {
      if(d==-2147483648 && divisor==-1){
         return 2147483647;
      }
      int r=d/divisor;
      
      if(r<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
      }
      if(r>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;}
      return r;
    }
}
class Solution {
    public int fib(int n) {
      if(n<=1){
        return n;
      } 
      int [] mem=new int[n+1];
      mem[0]=0;
      mem[1]=1;
      for(int i=2;i<=n;i++) {
        mem[i]=mem[i-1]+mem[i-2];
      }
      return mem[n];
    }
}
//it reduces space also

class Solution {
    public int fib(int n) {
      if(n<=1){
        return n;
      } 
      int sl=0, l=1, ans=-1;
      for(int i=2;i<=n;i++) {
        ans=sl+l;
        sl=l;
        l=ans;
        
      }
      return ans;
    }
}
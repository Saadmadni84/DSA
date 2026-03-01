class Solution {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> res=new ArrayList<>();
      helper(n,0,0,res,"");
      return res;
        
    }
    private void helper(int n,int open,int close, ArrayList<String> res,String curr){
        if(curr.length()==n){
            res.add(curr);
            return;
        }
        if(open<n/2){
            helper(n,open+1,close,res,curr+"(");
        }
        if(close<open){
            helper(n,open,close+1,res,curr+")");
        }
    }
}
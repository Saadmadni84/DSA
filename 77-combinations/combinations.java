class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> res =new ArrayList<>();
     List<Integer> ls=new ArrayList<>();
     backtrack(ls,1,n,k,res);  
     return res; 
    }
    public void backtrack(List<Integer> ls,int f,int n, int k,List<List<Integer>> res){
        if(ls.size()==k){
            res.add(new ArrayList<>(ls));
            return;
        }
       for(int i=f;i<=n;i++){
        ls.add(i);
        backtrack(ls,i+1,n,k,res);
        ls.remove(ls.size()-1);
       }
    }
}
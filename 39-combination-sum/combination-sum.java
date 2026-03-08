class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        int sum=0;
        helper(candidates,target,0,ls,new ArrayList<>(),sum);
        return ls;
    }
    private void helper(int [] c,int t,int i,List<List<Integer>> ls,List<Integer> curr,int sum){
        if(sum==t){
            ls.add(new ArrayList<>(curr));
            return;
        }
        if (sum > t) {
            return;
            }

        for(int f=i;f<c.length;f++){
            curr.add(c[f]);
            helper(c,t,f,ls,curr,sum+c[f]);
            curr.remove(curr.size()-1);
        }
    }
}
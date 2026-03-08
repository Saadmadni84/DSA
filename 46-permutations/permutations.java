class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<Integer> ls=new ArrayList<>();
      List<List<Integer>>res =new ArrayList<>();
      boolean[] used=new boolean[nums.length];
      helper(nums,ls,res,used); 
      return res; 
    }
    private void helper(int [] nums,List<Integer> ls, List<List<Integer>> res,boolean[]used){
        if(ls.size()==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            used[i]=true;
            ls.add(nums[i]);
            helper(nums,ls,res,used);
            used[i]=false;
            ls.remove(ls.size()-1);
        }
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ls=new ArrayList<>();
       Arrays.sort(nums);
       helper(nums,new ArrayList<>(),0 ,ls); 
       return ls;
    }
    private void helper(int [] a,List<Integer> curr,int i, List<List<Integer>> ls){
        if(i==a.length){
            ls.add(new ArrayList<>(curr));
            return;
        }
        curr.add(a[i]);
        helper(a,curr,i+1,ls);
        curr.remove(curr.size()-1);
        while (i + 1 < a.length && a[i] == a[i + 1]) {
            i++;
        }
        helper(a, curr, i + 1, ls);
    }
}
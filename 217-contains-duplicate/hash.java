class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> m=new HashSet<>();
      int i=0;
      while(i<nums.length){
        if(m.contains(nums[i])){
            return true;
        }
        else{
            m.add(nums[i]);
        }
        i++;
      }
      return false;
    }
}

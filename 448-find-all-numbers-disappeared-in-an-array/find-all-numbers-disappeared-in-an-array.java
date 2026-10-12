class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     Set<Integer> s=new HashSet<>();
     List<Integer> mis=new ArrayList<>();
     int i=0;
     while(i<nums.length){
        s.add(nums[i]);
        i++;
     }
     i=1;
     while(i<=nums.length){
       if(!s.contains(i)){
        mis.add(i);
       }
       i++;
     }
     return mis;
    }
}
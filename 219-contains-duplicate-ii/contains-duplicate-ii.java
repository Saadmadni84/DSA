class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=1;
        Set<Integer> s=new HashSet<>();
        s.add(nums[i]);
        while(j<nums.length){
            if((j-i)>k){
                s.remove(nums[i]);
                i++;
            }
            if(s.contains(nums[j])){
                return true;
            }
            s.add(nums[j]);
            j++;
        }
        return false;
    }
}
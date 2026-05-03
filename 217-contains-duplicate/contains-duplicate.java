class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1;
        int count=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
              count++; 
            }
            i++;
            j++;
        }
        if(count==nums.length-1){
            return false;
        }
        return true;
    }
}
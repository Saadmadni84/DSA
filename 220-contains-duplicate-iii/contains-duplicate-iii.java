class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
     TreeSet<Integer> set=new TreeSet<>();
     set.add(nums[0]);

     for(int i=1;i<nums.length;i++){
        int num=nums[i];
        
        Integer vlow=set.floor(num);

        if(vlow!=null && (num-vlow)<=valueDiff){
            return true;
        }

        Integer vhigh=set.ceiling(num);

        if(vhigh!=null && (vhigh-num)<=valueDiff){
            return true;
        }

        set.add(num);
        if(i-indexDiff>=0){
          set.remove(nums[i-indexDiff]);
        }
     }  
     return false;
    }
}
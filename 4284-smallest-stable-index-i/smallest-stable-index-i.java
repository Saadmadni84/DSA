class Solution {
    public int firstStableIndex(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
             p.add(nums[i]);
        }
        int l=0;
        int max=nums[0];
        while(l<nums.length){
            if(nums[l]>max){
                max=nums[l];
            }
            int min = p.peek();
            if(max-min<=k){
                return l;
            }
          
            p.remove(nums[l]);
            l++;
        

        }
        return -1;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> m=new PriorityQueue<>(Collections.reverseOrder());
       for(int t:nums){
        m.add(t);
       } 
       int res=0;
       while(k>0){
         res=m.poll();
         k--;
       }
       return res;
    }
}

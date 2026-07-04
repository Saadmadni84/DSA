class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
       
        HashMap<Integer,Integer> m=new HashMap<>();
         m.put(0,-1);
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(m.containsKey(rem)){
                if(i-m.get(rem)>=2){
                    return true;
                }

            }
            m.putIfAbsent(rem,i);
        }
        return false;
    }
}
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        long sum=0;
        long l=0;
        long r=0;
        Arrays.sort(nums);
            int i=0;
            while(i<n){
              if(i<n/2){
                 l=nums[i]*nums[i]+l;
              }
              else{
                  r=nums[i]*nums[i]+r;
              }
              i++;
            }
            sum=r-l;
 
          return sum;  
    }
  
}
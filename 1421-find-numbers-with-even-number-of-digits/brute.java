class Solution {
    public int findNumbers(int[] nums) {
       int res=0;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int c=0;
        while(n>0){
           n=n/10;
           c++;
        }
        if(c%2==0){
            res++;
        }
       }
       return res; 
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
     int [] pos=new int[nums.length/2];
     int [] neg=new int[nums.length/2]; 
     int k=0;
     int l=0; 
     for(int i=0;i<nums.length;i++){
          if(nums[i]>=0){
             pos[k]=nums[i];
             k++;
          }
          else{
            neg[l]=nums[i];
            l++;
          }
     } 
     k=0;
      l=0; 
     for(int i=0;i<nums.length;i=i+2){
          nums[i]=pos[k];
          nums[i+1]=neg[l];
          k++;
          l++;
     }
     return nums;
    }
}
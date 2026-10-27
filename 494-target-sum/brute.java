class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums,0,0,target);
        return count;
    }
    private void helper(int [] arr,int i,int sum,int t){
        if(i==arr.length){
            if(sum==t){
                count=count+1;
            }
           return;
        }
        helper(arr,i+1,sum+arr[i],t);
        helper(arr,i+1,sum-arr[i],t);
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        int i=0;
        while(i<2*n){
            int j=i%n;
            ans[i]=nums[j];
            i++;
        }
        return ans;
    }
}
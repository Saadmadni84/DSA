class Solution {
    public int[] twoSum(int[] n, int target) {
      
       int i=0;
       int j=n.length-1;
       while(i<j){
        int csum=n[i]+n[j];
        if(csum==target){
            return new int[]{i+1,j+1};
        }
        else if(csum>target){
            j--;
        }
        else{
            i++;
        }

       }
       return new int[2];
    }
}
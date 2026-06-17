class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int [] res=new int[2];
       int i=0;
       int j=1;
       while(i<numbers.length-1){
            res[0]=i+1;
            target=target-numbers[i];
            j=i+1;
            while(j<numbers.length){
                if(target-numbers[j]==0){
                    res[1]=j+1;
                    return res;
                   
                }
                 j++;
                
            }
            target=target+numbers[i];
            i++;
       } 
       return res;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> m = new HashSet<>();
        for(int n:nums){
            m.add(n);
        }
        int max=0;
        int count=0;
        for(int n:m){
            if(!m.contains(n-1)){
                int currnum=n;
                count=1;
                while(m.contains(currnum+1)){
                    count++;
                    currnum++;
            
                }
                if(count>max){
                    max=count;
                }

            }
        }
        return max;

    }
}
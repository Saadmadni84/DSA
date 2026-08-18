class Solution {
    public int largestInteger(int[] nums, int k) {
        List<Set<Integer>> ls=new ArrayList<>(); 
        for(int i=0;i<=nums.length-k;i++){
             Set<Integer> tem=new HashSet<>();
            for(int j=i;j<k+i;j++){
                tem.add(nums[j]);
            }
            ls.add(tem);
        }
        Arrays.sort(nums);
    
        int l=nums.length-1;
        while(l>=0){
            int c=0;
            for(int i=0;i<ls.size();i++){
                if(ls.get(i).contains(nums[l])){
                    c++;
                }

            }
            if(c==1){
                return nums[l];
            }
            l--;

        }
        return -1;
        
    }
}
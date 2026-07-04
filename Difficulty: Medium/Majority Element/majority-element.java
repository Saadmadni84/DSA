class Solution {
    int majorityElement(int arr[]) {
        int md=arr.length/2;
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:arr){
             m.put(num,m.getOrDefault(num,0)+1);
            if(m.containsKey(num)){
                if(m.get(num)>md){
                    return num;
                }
            }
        
           
        }
        return -1;
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> m=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            m.add(n);
        }
        while(m.size()>1){
            int x=m.poll();
            int y=m.poll();
            if(x==y){

            }
            else{
                m.add(x-y);
            }
        }
        if(m.size()==0){
            return 0;
        }
        int res=m.poll();
        return res;
    }
}
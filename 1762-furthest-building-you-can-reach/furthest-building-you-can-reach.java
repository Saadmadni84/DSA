class Solution {
    public int furthestBuilding(int[] h, int b, int l ){
       PriorityQueue<Integer> p=new PriorityQueue<>();
       for(int i=0;i<h.length-1;i++){
        int d=h[i+1]-h[i];
        if(d>0){
            p.add(d);
            if(p.size()>l){

                b=b-p.poll();
            }
            if(b<0){
                return i;
            }
        }
       }
       return h.length-1;
    }
}
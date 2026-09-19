class KthLargest {
    PriorityQueue<Integer> p;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        p=new PriorityQueue<Integer>();
        for(int num:nums){
            p.add(num);
            if(p.size()>k){
                p.poll();
            }
        }  
    }
    
    public int add(int val) {
       if(p.size()<k){
        p.add(val);
        return p.peek();
       }
       p.add(val);
       p.poll();
       return p.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
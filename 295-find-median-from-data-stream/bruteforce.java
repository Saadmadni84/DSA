class MedianFinder {
    PriorityQueue<Integer> max;
     PriorityQueue<Integer> min;
    
    public MedianFinder() {
        max= new  PriorityQueue<Integer>(Collections.reverseOrder());
        min= new  PriorityQueue<Integer>();
    }
    public void addNum(int num) {
       if(max.size()<=min.size()){
        max.add(num);
       }
       else
    }
    
    public double findMedian() {
        Collections.sort(p);
        if(p.size()%2==1){
           return p.get(p.size()/2);
        }
        else{
            return (p.get(p.size()/2)+p.get(p.size()/2-1))/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

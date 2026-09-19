class MedianFinder {
    PriorityQueue<Integer> max;
     PriorityQueue<Integer> min;
    
    public MedianFinder() {
        max= new  PriorityQueue<Integer>(Collections.reverseOrder());
        min= new  PriorityQueue<Integer>();
    }
    public void addNum(int num) {
        max.add(num);
      if (max.size()> min.size()+1) {
          min.add(max.poll());
       }
     if (!min.isEmpty() && max.peek() > min.peek()) {
        min.add(max.poll());
        max.add(min.poll());
       }
    }
    
    public double findMedian() {
        if(max.size()>min.size()){
            return (double)max.peek();
        }
        return (max.peek()+min.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
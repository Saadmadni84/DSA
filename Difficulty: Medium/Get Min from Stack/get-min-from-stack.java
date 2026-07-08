class Node{
    int x;
    int min;
    public Node(int x,int m){
        this.x=x;
        this.min=m;
    }
}
class SpecialStack {
      Stack<Node> s;
    public SpecialStack() {
     s=new Stack();
    }

    public void push(int x) {
       if(s.isEmpty()){
          s.push(new Node (x,x));
          return;
       }
       Node top=s.peek();
       int min=top.min;
       if(min>x){
           s.push(new Node(x,x));
           return;
       }
       else{
           s.push(new Node(x,min));
           return;
       }
    }

    public void pop() {
       if(s.isEmpty()){
           return;
       }
       s.pop();
    }

    public int peek() {
        if(s.isEmpty()){
           return -1;
       }
      Node nodeTop=s.peek();
        return nodeTop.x; 
    }

    boolean isEmpty() {
       if(s.isEmpty()){
           return true;
       }
       else{
           return false;
       }
    }

    public int getMin() {
        if(s.isEmpty()){
            return -1;
        }
       Node top=s.peek();
       int min=top.min;
       return min;
    }
}
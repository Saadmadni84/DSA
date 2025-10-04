class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
class stack{
    Node top;
    Node temp;
    void push(int ele){
        temp =new Node(ele);
        temp.next=top;
        top=temp;

    }
    int pop(){
        int ele=top.val;
        top=top.next;
        return ele;
    }
} 


public class stacklinkedlist {
    public static void main(String [] args){
        stack s=new stack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
          
    }
    
}

class Node {
    int data; //data is of type int
    Node next; //next is of Node type
    Node(int data){ //creaing contructor of type node
        this.data=data;
        this.next=null;}
    }

class ab{
    Node head;
    void add(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }

    }
}
public class laddelement{
    public static void main(String []args){
        ab a=new ab();
        a.add(10);
        a.add(20);
        

    }
    
}

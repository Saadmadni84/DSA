 import java.util.*;
 class Node {
    int data; //data is of type int
    Node next; //next is of Node type
    Node(int data){ //creaing contructor of type node
        this.data=data;
        this.next=null;}
    
}
class linkedintro{
    Node head; //head is of type node
    void printlinkedlist(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
public class intro{
public static void main(String [] args){
    linkedintro l= new linkedintro();
    Node p1=new Node(10); //object is created through which data is passed in contructor
    Node p2=new Node(20);
    Node p3=new Node(30);
    l.head=p1;
    p1.next=p2;
    p2.next=p3;
    l.printlinkedlist();
    
}
}

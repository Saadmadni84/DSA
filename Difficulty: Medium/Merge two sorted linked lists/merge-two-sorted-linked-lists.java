/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node curr1=head1;
        Node curr2=head2;
        Node curr3=new Node(0) ;
        Node head=curr3;
        while(curr1!=null && curr2!=null){
            if(curr2.data>curr1.data){
                head.next=curr1;
               
                curr1=curr1.next;
            }
            else{
                  head.next=curr2;
                 curr2=curr2.next;
            }
             head=head.next;
        }
         head.next=curr1==null?curr2:curr1;
        return curr3.next;
    }
}
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        if(head==null){
            return 0;
        }
        Node curr=head;
        
        int l=0;
       while(curr!=null){
           l++;
           curr=curr.next;
       }
       return l;
        
    }
}
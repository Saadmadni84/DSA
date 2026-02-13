/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    private Node tail = null;

    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        
        if (head == null) {
            tail = newNode;
            return newNode;
        }
        if (tail == null || tail.next != null) {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            tail = curr;
        }
        tail.next = newNode;
        tail = newNode; 
        
        return head;
    }
}
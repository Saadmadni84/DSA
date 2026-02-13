class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        
        Node curr = head;
        while (curr.next != null) { // Stop when the NEXT is null
            curr = curr.next;
        }
        
     
        curr.next = newNode;
        
        return head;
    }
}

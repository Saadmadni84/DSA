/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
   public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }


        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node dummyHead = new Node(0);
        Node copyCurr = dummyHead;

        while (curr != null) {
            Node nextOriginal = curr.next.next;

    
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;

            curr.next = nextOriginal;

            curr = nextOriginal;
        }

        return dummyHead.next;
    }
}
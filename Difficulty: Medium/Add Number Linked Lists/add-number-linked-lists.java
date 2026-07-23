/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {

    Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public Node addTwoLists(Node l1, Node l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);

        Node dummy = new Node(0);
        Node p = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int a = (l1 != null) ? l1.data : 0;
            int b = (l2 != null) ? l2.data : 0;

            int sum = a + b + carry;
            carry = sum / 10;

            p.next = new Node(sum % 10);
            p = p.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        Node ans = reverse(dummy.next);
        while (ans != null && ans.data == 0 && ans.next != null) {
            ans = ans.next;
        }

        return ans;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int[] vals = new int[count];
        curr = head;
        for (int i = 0; i < count; i++) {
            vals[i] = curr.val;
            curr = curr.next;
        }

        Arrays.sort(vals);

        curr = head;
        for (int i = 0; i < count; i++) {
            curr.val = vals[i];
            curr = curr.next;
        }

        return head;
    }
}
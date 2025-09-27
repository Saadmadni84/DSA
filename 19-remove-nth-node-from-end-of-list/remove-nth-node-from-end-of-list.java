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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=new ListNode(0);
        p.next=head;
        ListNode m=p;
        ListNode t=p;
        int i=0;
        while(i<=n){
            t=t.next;
            i++;
        }
        while(t!=null){
            t=t.next;
            m=m.next;   
        }
        m.next=m.next.next; 
        return p.next;  
    }
}
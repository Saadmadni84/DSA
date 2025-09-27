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
        ListNode curr=head;
        ListNode t=p;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int k=count-n;
        for(int i=0;i<k;i++){
            t=t.next;
        }
        t.next=t.next.next; 
        return p.next;  
    }
}
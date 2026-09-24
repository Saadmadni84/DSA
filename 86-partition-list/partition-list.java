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
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        ListNode dummy= new ListNode(0);
        ListNode less=dummy;
        while(curr!=null){
            if(curr.val<x){
               less.next= new ListNode(curr.val);
               less=less.next;
            }
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.val>=x){
             less.next= new ListNode(curr.val);
               less=less.next;
            }
            curr=curr.next;
        }
        less.next = null;
        return dummy.next;
    }
}
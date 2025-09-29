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
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null || head.next == null){
        return head;
      }
      ListNode tail=null;
      ListNode curr=head;
      int size=0;
      while(curr!=null){
        tail=curr;
        curr=curr.next;
        size++;
      }
      int nk=k%size;
      if(nk==0){
        return head;
      }
      int diff=size-nk;
      int i=0;
      curr=head;
      while(i<diff-1){
        curr=curr.next;
        i++;
      }
       ListNode newh=curr.next;
       curr.next=null;
       tail.next=head;
       return newh;
        
    }
}
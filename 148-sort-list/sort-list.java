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
     List<Integer> ls=new ArrayList<>();
     ListNode curr=head;
     while(curr!=null){
        ls.add(curr.val);
        curr=curr.next;
     } 
    Collections.sort(ls);
     curr=head;
     int i=0;
     while(curr!=null){
        curr.val=ls.get(i);
        curr=curr.next;
        i++;
     }
     return head; 
    }
}
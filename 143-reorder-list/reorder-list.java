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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
     ListNode curr=head;
     List<Integer> ls=new ArrayList<>();
     while(curr!=null){
       ls.add(curr.val);
       curr=curr.next;
     }
     int i=0,j=ls.size()-1;
     curr = head;
     while(i<=j){
        if(i==j){
             curr.val=ls.get(i);
             break;
        }
        curr.val=ls.get(i);
        curr=curr.next;
        curr.val=ls.get(j);
        curr=curr.next;
        i++;
        j--;
     }  
    }
}
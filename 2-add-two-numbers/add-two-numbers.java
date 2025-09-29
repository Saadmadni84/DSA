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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode(0);
        ListNode p=d;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int a=(l1!=null)?l1.val:0;
            int b=(l2!=null)?l2.val:0; 
            int sum=(a+b+c)%10;
            c=(a+b+c)/10;
            p.next=new ListNode(sum);
            p=p.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
               l2=l2.next;
            }
            
        }
       return d.next;
        
    }
}
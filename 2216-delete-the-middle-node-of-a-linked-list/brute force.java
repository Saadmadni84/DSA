class Solution {
    public ListNode deleteMiddle(ListNode head) {

       ListNode p=new ListNode(0);
       p.next=head;
       ListNode m=p;
       ListNode curr = head;
       int count=0;
       while(curr!=null){
        curr=curr.next;
        count++;
       } 
      
       for(int i=0;i<count/2;i++){
         m=m.next;
       }
       m.next=m.next.next;
       return p.next;
       
    }
}

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

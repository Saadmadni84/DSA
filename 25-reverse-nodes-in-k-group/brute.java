class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode curr = head;
      List<Integer> ls=new ArrayList<>();
      int c=0;
      while(curr!=null){
        ls.add(curr.val);
        curr=curr.next;
        c++;
      }
      curr=head;
      int p=c/k;
      int i=0;
       int j=k-1;
      while(p!=0){
        while(i<=j){
            curr.val=ls.get(j);
            curr=curr.next;
            j--;
        }
        p--;
        i=i+k;
        j=i+k-1;
      }
      return head;
        
    }
}

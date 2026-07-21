class Solution {
    public void reorderList(ListNode head) {
      ListNode curr=head;
      int c=0;
      while(curr!=null){
           c++;
           curr=curr.next;
      }
      curr=head;
      int [] arr=new int[c];
      int f=0;
      while(curr!=null){
        arr[f]=curr.val;
        curr=curr.next;
        f++;
      }
      int i=0;
      int j=c-1;
      while(i<=j){
         head.val=arr[i];
         head=head.next;
         i++;
         if(i<=j){
            head.val=arr[j];
            head=head.next;
              j--;
         }
       
      }
    }
}

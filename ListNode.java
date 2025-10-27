// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
        next = null;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}

class Solution {
    public Node ListNode(Node head, int insertVal) {
        
        if(head==null){
            Node p=new Node(insertVal);
            p.next=p;
            return p;
        }
        Node prev=head;
        Node curr=head.next;
        do{
            if(prev.val<=insertVal && curr.val>=insertVal){
                Node p=new Node(insertVal);
                prev.next=p;
                p.next=curr;
                return head;
            }
            else if(curr.val<prev.val){
                if(insertVal>=prev.val){
                    Node p=new Node(insertVal);
                    prev.next=p;
                    p.next=curr;
                    return head;
                }
                if(insertVal<=curr.val){
                    Node p=new Node(insertVal);
                    prev.next=p;
                    p.next=curr;
                    return head;
                }

            }
            prev=curr;
            curr=curr.next;
        }while(prev!=head);

        Node p=new Node(insertVal);
                    prev.next=p;
                    p.next=curr;
      
                    return head;
    }
    
        
    
}

/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
      return helper(r1, r2);
        
    }
    private boolean helper(Node p,Node q){
        if(p==null && q==null){
            return true;
        }
        if(p==null ||q==null ||p.data!=q.data){
            return false;
        }
        return helper(p.right,q.right) && helper(p.left,q.left);
    }
}
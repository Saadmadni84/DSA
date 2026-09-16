/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
      return helper(root,n1,n2);
        
    }
    private Node helper(Node node,int n1,int n2){
        if(node==null || node.data==n1 || node.data==n2){
            return node;
        }
        Node l=helper(node.left,n1,n2);
        Node r=helper(node.right,n1,n2);
         if(l!=null && r!=null){
             return node;
         }
         return l!=null?l:r;
    }
}
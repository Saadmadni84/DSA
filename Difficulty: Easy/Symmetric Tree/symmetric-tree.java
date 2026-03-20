/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
       return helper(root,root);
        
    }
    private boolean helper(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null ||root1.data!=root2.data){
            return false;
        }
        return helper(root1.left,root2.right) && helper(root1.right,root2.left);
    }
}
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
       return Math.max(depth(root.left),depth(root.right));
        
    }
    private int depth(Node root){
        if(root==null){
            return 0;
        }
        int l=depth(root.left);
        int r=depth(root.right);
        
        return 1+Math.max(l,r);
    }
}
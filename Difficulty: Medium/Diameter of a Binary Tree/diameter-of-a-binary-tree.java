/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int mdia;
    public int diameter(Node root) {
     helper(root);
      return mdia;  
    }
    private int helper(Node node){
        if(node==null){
            return 0;
        }
        int l=helper(node.left);
        int r=helper(node.right);
        
        mdia=Math.max(mdia,l+r);
        return 1+Math.max(l,r);
    }
}
/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int m=0;
    public int diameter(Node root) {
       depth(root);
       return m;
        
    }
    private int depth(Node root){
        if(root==null){
            return 0;
        }
        int l=depth(root.left);
        int r=depth(root.right);
        
        m=Math.max(m,l+r);
        return 1+Math.max(l,r);
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root ==null && subroot!=null){
            return false;
        }
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
              
              TreeNode node=s.pop();
              if (node.val == subroot.val) {
                if (helper(node, subroot)) {
                    return true;
                }
            }
    
              if(node.right!=null){
               s.push(node.right);
              }
              if(node.left!=null){
               s.push(node.left);
              }
        }
      return false; 
    }
     private boolean helper(TreeNode p,TreeNode q){
            if(p==null && q==null){
            return true;
        }
        if (p == null || q == null || p.val != q.val) return false;
    
    return helper(p.left, q.left) && helper(p.right, q.right);
        }
}
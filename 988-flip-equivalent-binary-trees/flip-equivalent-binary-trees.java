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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return helper(root1,root2);
    }
    private boolean helper(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if (p == null || q == null || p.val != q.val) return false;
    
        return (helper(p.left, q.left) && helper(p.right, q.right)) ||
       (helper(p.left, q.right) && helper(p.right, q.left));
        }
}
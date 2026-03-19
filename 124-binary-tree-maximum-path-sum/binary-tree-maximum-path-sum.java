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
    int max=0;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
       helper(root); 
       return max;
    }
    private int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,helper(root.left));
        int r=Math.max(0,helper(root.right));
        int curr=root.val+l+r;
        max=Math.max(max,curr);
        return root.val+Math.max(l,r); 
    }
}
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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return c;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return -10000;
        }
        int lm=dfs(root.left);
        int rm=dfs(root.right);

        int subtree=Math.max(root.val,Math.max(lm,rm));

        if(root.val==subtree){
            c++;
        }
        return subtree;
    }
}
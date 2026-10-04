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
    TreeNode ans;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int md=dfs(root);
        sms(root,md,1);
        return ans;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=dfs(root.left);
        int r=dfs(root.right);
        return 1+Math.max(l,r);
    }
    private int sms(TreeNode root,int md,int d){
        if(root==null){
            return -1;
        }
        if(d==md){
            ans=root;
            return d;
        }
        int l=sms(root.left,md,d+1);
        int r=sms(root.right,md,d+1);
        if(l==md && r==md){
            ans=root;
        }
        return Math.max(l,r);

    }

}
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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
       int d=dfs(root); 
       dls(root,d,0);
       return sum;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
       int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
    private void dls(TreeNode root,int d,int c){
        
        if(root==null){
            return;
        }
         if(c==d-1){
            sum=sum+root.val;
        }
       
        dls(root.left,d,c+1);
        dls(root.right,d,c+1);
        
    }
}
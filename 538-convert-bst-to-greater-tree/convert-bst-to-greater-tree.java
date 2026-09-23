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
    public TreeNode convertBST(TreeNode root) {
     Stack<TreeNode> stack= new Stack<>();
     int sum=0;
     TreeNode prev =root;
     TreeNode curr=prev;
     while(curr!=null || !stack.isEmpty()){
        while(curr!=null){
            stack.push(curr);
            curr=curr.right;
        }
        curr=stack.pop();
        sum=sum+curr.val;
        curr.val=sum;
        curr=curr.left;
     }
     return prev; 
    }
}
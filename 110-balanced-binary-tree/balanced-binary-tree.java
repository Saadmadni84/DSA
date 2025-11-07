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
    // Helper method: returns height if balanced, else -1
    private int mdepth(TreeNode node) {
        if (node == null) return 0;

        int left = mdepth(node.left);
        if (left == -1) return -1; // left subtree not balanced

        int right = mdepth(node.right);
        if (right == -1) return -1; // right subtree not balanced

        // If height difference > 1, not balanced
        if (Math.abs(left - right) > 1) return -1;

        // Return height of current node
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        // Tree is balanced if mdepth(root) doesn't return -1
        return mdepth(root) != -1;
    }
}

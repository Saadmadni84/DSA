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

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxDepth = getDepth(root);

        findLCA(root, 1, maxDepth);

        return ans;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
            getDepth(root.left),
            getDepth(root.right)
        );
    }

    private int findLCA(TreeNode root, int depth, int maxDepth) {
        if (root == null) {
            return -1;
        }
        if (depth == maxDepth) {
            ans = root;
            return depth;
        }

        int left = findLCA(root.left, depth + 1, maxDepth);
        int right = findLCA(root.right, depth + 1, maxDepth);

        if (left == maxDepth && right == maxDepth) {
            ans = root;
        }

        return Math.max(left, right);
    }
}
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
    public List<TreeNode> delNodes(TreeNode root, int[] d) {
        Set<Integer> set = new HashSet<>();
        for (int val : d) {
            set.add(val);
        }

        List<TreeNode> res = new ArrayList<>();
        
        TreeNode r = dfs(root, set, res);
        if (r != null) {
            res.add(r);
        }

        return res;
    }

    private TreeNode dfs(TreeNode root, Set<Integer> set, List<TreeNode> res) {
        if (root == null) {
            return null;
        }

        root.left = dfs(root.left, set, res);
        root.right = dfs(root.right, set, res);

        if (set.contains(root.val)) {
            if (root.left != null) {
                res.add(root.left);
            }
            if (root.right != null) {
                res.add(root.right);
            }
            return null;
        }

        return root;
    }
}
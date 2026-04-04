class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if (root == null) return false;
        
        // 1. Is the current root a match?
        // 2. Or is the subtree somewhere in the left branch?
        // 3. Or is the subtree somewhere in the right branch?
        return helper(root, subroot) || isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    
    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return helper(p.left, q.left) && helper(p.right, q.right);
    }
}

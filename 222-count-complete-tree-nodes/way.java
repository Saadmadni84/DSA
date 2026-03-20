class Solution {
    public int countNodes(TreeNode root) {
        // Base case: An empty tree has 0 nodes
        if (root == null) {
            return 0;
        }
        
        // Recursive step: 1 (for current node) + count of children
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

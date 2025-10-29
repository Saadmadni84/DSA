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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        TreeNode prev=null,
        curr=root;

        while (curr != null && curr.val != key) {
            prev= curr;
            if (key < curr.val)
                curr = curr.left;
            else
                curr = curr.right;
        }
        if (curr == null) return root;
       
         // Case 1: Node has no children 
        if (curr.left == null && curr.right == null) {
            if (prev == null) return null; 
            if (prev.left == curr) prev.left = null;
            else prev.right = null;
        }
         // --- Case 2: Node has one child ---
        else if (curr.left == null || curr.right == null) {
            TreeNode child = (curr.left != null) ? curr.left : curr.right;

            if (prev == null) {
                // deleting root
                root = child;
            } else if (prev.left == curr) {
                prev.left = child;
            } else {
                prev.right = child;
            }
        }

        // --- Case 3: Node has two children ---
        else {
            TreeNode succParent = curr;
            TreeNode succ = curr.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            // Replace value
            curr.val = succ.val;

            // Delete successor node
            if (succParent.left == succ) {
                succParent.left = succ.right;
            } else {
                succParent.right = succ.right;
            }
        }

        return root;
    }
}
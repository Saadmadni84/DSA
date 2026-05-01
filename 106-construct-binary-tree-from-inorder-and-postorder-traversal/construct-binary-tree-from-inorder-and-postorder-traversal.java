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
    int po;
    Map<Integer,Integer> m=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        po=postorder.length-1;
      for(int i=0;i<inorder.length;i++) {
        m.put(inorder[i],i);
      }
      return helper(postorder,0,postorder.length-1);
    }
    private TreeNode helper(int [] p,int s,int e){
        if(s>e){
            return null;
        }
        int val=p[po--];
        TreeNode root=new TreeNode(val);
        int i=m.get(val);
        root.right=helper(p,i+1,e);
        root.left=helper(p,s,i-1);
       
        return root;
    }
}
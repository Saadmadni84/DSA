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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<Pair<TreeNode,Integer>> s=new Stack<>();
        s.add(new Pair<TreeNode,Integer>(root,0));
        while(!s.isEmpty()){
              Pair<TreeNode,Integer> p=s.pop();

              TreeNode node=p.getKey();
              int val=p.getValue();
              val=val+node.val; 
              
              if(node.left==null && node.right==null){
                if(targetSum==val){
                    return true;
                }
                continue;
              }
              if(node.right!=null){
                s.add(new Pair<TreeNode,Integer>(node.right,val));
              } 
              if(node.left!=null){
                s.add(new Pair<TreeNode,Integer>(node.left,val));
              }        
        
        }
        return false;

    }  
}
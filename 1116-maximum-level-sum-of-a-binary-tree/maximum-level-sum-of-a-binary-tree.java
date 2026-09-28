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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int max=-30000;
        q.add(root);
        int level=1;
        int res=1;
        while(!q.isEmpty()){
            int sum=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                 TreeNode p=q.poll();
                 sum=sum+p.val;
                 
                if(p.left!=null){
                   q.add(p.left);
                }
                if(p.right!=null){
                    q.add(p.right);
                }
            }
            if(sum>max){
                max=sum;
                res=level;
            }
            level=level+1;
        }
        return res;
    }
}
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
    public TreeNode helper(int [] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;

        int nodeVal=nums[mid];
        TreeNode node=new TreeNode(nodeVal);

        node.left= helper(nums,start,mid-1);
        node.right= helper(nums,mid+1,end);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=helper(nums,0,nums.length-1);
        return root;
    }
}
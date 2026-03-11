class Solution {
    List<Integer> res =new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       helper(root);
       return res;
    }
    private void helper(TreeNode curr){
        if(curr==null){
            return ;
        }
        helper(curr.left);
        res.add(curr.val);
        helper(curr.right);
    }
}

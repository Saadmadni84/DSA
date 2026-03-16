class Solution {
        public List<Integer> preorderTraversal(TreeNode root)  {
            List<Integer> ls= new ArrayList<>();
            Stack<TreeNode> s=new Stack<>();
            if(root==null){
                return ls;
            }
            s.push(root);
            while(!s.isEmpty()){
              TreeNode node=s.pop();
              ls.add(node.val);
              if(node.right!=null){
               s.push(node.right);
              }
              if(node.left!=null){
               s.push(node.left);
              }
            }
            return ls;     
    }
}

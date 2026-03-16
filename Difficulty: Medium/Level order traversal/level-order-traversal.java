/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
       if(root==null){
          return res; 
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
            ArrayList<Integer> ls=new ArrayList<>();
           int n=q.size();
           for(int i=0;i<n;i++){
           
               Node node=q.remove();
               ls.add(node.data);
               if(node.left!=null){
                   q.add(node.left);
               }
               if(node.right!=null){
                   q.add(node.right);
               }
           }
           res.add(ls);
           
       }
       return res;
    }
}
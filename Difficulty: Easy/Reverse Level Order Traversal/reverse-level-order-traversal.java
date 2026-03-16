/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
      ArrayList<Integer> res=new ArrayList<>();
       if(root==null){
          return res; 
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
          int n=q.size();
           for(int i=0;i<n;i++){
           
               Node node=q.remove();
               res.add(node.data);
               
               if(node.right!=null){
                   q.add(node.right);
               }
               if(node.left!=null){
                   q.add(node.left);
               }
           }
       }
       Collections.reverse(res);
       return res;
    }
}
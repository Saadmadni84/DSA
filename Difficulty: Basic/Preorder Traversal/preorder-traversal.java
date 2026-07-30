/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
      ArrayList<Integer> ls=new ArrayList<>();
      Stack<Node> s=new Stack<>();
      Node curr=root;
      while(curr!=null || !s.isEmpty()){
         while(curr!=null){
             ls.add(curr.data);
             s.add(curr);
             curr=curr.left;
         }
         curr=s.pop();
         curr=curr.right;
      }
      return ls;
        
    }
}
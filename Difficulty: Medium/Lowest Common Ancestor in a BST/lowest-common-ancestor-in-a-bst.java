/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node findLCA(Node root, Node n1, Node n2) {
       int p=n1.data;
       int q=n2.data;
       Node curr=root;
       while(curr!=null){
           if(p<curr.data && q<curr.data){
               curr=curr.left;
           }
           else if(p>curr.data && q>curr.data){
               curr=curr.right;
           }
           else{
                return curr;
           }
          
       }
       return null;
        
    }
}
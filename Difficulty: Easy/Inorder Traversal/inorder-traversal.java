/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
    ArrayList<Integer> ls=new ArrayList<>();
    Stack<Node> s=new Stack<>();
    Node curr=root;
    while(curr!=null || !s.isEmpty()){
        while(curr!=null){
            s.push(curr);
            curr=curr.left;
        }
        curr=s.pop();
        ls.add(curr.data);
        curr=curr.right;
    }
    return  ls;
        
    }
}
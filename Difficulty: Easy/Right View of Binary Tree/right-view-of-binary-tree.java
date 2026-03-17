/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ls=new ArrayList<>();
    helper(root,0,ls);
    return ls;
    }
    private void helper(Node root,int level,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        if(ls.size()==level){
            ls.add(root.data);
        }
        helper(root.right,level+1,ls);
        helper(root.left,level+1,ls);
        
    }
}
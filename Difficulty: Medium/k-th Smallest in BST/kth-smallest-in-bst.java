/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int result=-1;
    int count=0;
    public int kthSmallest(Node root, int k) {
        helper(root,k);
        return result;
        
    }
    private void helper(Node curr,int k){
        if(curr==null){
            return;
        }
        helper(curr.left,k);
        count++;
        if(count==k){
           result=curr.data;
           return;
        }
       helper(curr.right,k);
    }
}
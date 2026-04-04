/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
        if(T==null) return false;
       return helper(T,S)|| isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    private static boolean helper(Node t,Node s){
        if(t==null && s==null){
            return true;
        }
        if(t==null || s==null || t.data!=s.data){
            return false;
        }
        return helper(t.left,s.left)|| helper(t.right,s.right);
    }
}
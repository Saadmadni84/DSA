/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
       static int pi=0;
      static Map<Integer,Integer> m=new HashMap<>();
    public static Node buildTree(int inorder[], int preorder[]) {
        pi = 0;
        m.clear();
      for(int i=0;i<inorder.length;i++){
          m.put(inorder[i],i);
      }
      return helper(preorder,0,inorder.length-1);
        
    }
    private static Node helper(int [] p,int s,int e){
        if(s>e){
            return null;
        }
        int rootval=p[pi++];
        Node root=new Node(rootval);
        
        int id=m.get(rootval);
        
        root.left=helper(p,s,id-1);
        root.right=helper(p,id+1,e);
        
        return root;
    }
}
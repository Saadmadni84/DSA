/* class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int pi=0;
    Map<Integer,Integer> m=new HashMap<>();
    public Node preToBST(int pre[]) {
       int [] in=pre.clone();
       Arrays.sort(in);
       for (int i = 0; i < in.length; i++) {
            m.put(in[i], i);
        }
        return helper(pre,0,pre.length-1);
        
    }
    private Node helper(int [] p,int s,int e){
        if(s>e) return null;
        
        int val=p[pi++];
        Node root=new Node(val);
        int i=m.get(val);
        root.left =helper(p,s,i-1);
        root.right=helper(p,i+1,e);
        return root;
    }
}
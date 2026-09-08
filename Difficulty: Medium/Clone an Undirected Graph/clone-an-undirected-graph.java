/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
      HashMap<Node,Node> mp=new HashMap<>();
      return helper(node,mp);
        
    }
    private Node helper(Node node, HashMap<Node,Node> mp){
        Node dup=new Node(node.val);
        mp.put(node,dup);
        for(Node nei: node.neighbors){
             if(!mp.containsKey(nei)){
                 dup.neighbors.add(helper(nei,mp));
             }
             else{
                 dup.neighbors.add(mp.get(nei));
             }
        }
        return dup;
    }
}
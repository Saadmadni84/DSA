// User function Template for Java

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
    Node cloneGraph(Node node) {
          if (node == null) return null;

        HashMap<Node, Node> mp = new HashMap<>();
        return helper(node, mp);
        
    }
    private Node helper(Node node, HashMap<Node, Node> mp) {
        Node newNode = new Node(node.val);
        mp.put(node, newNode);

        for (Node neighbor : node.neighbors) {
            if (!mp.containsKey(neighbor)) {
                newNode.neighbors.add(helper(neighbor, mp));
            } else {
                newNode.neighbors.add(mp.get(neighbor));
            }
        }

        return newNode;
    }
}
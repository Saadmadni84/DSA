/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                currentLevel.add(curr.data);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (!leftToRight) {
                Collections.reverse(currentLevel);
            }
            result.addAll(currentLevel);
            
            leftToRight = !leftToRight;
        }

        return result;
    }
}
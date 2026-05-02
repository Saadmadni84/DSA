/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
 
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder s=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.remove();
            if(node==null){
                s.append("n ");
                continue;
            }
            s.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
           return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        String [] sp=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(sp[0]));
        q.add(root);
        for(int i=1;i<sp.length;i++){
            TreeNode node=q.remove();
            if(!sp[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(sp[i]));
                node.left=left;
                q.add(left);
            }
            if(!sp[++i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(sp[i]));
                node.right=right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
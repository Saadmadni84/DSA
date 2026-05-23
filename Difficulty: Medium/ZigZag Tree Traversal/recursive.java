class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        dfs(root, 0, result);

        return result;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> result) {

        if (node == null)
            return;

        // create new level if needed
        if (level == result.size()) {
            result.add(new LinkedList<>());
        }

        LinkedList<Integer> currentLevel =
                (LinkedList<Integer>) result.get(level);

        // even level -> left to right
        if (level % 2 == 0) {
            currentLevel.addLast(node.val);
        }

        // odd level -> right to left
        else {
            currentLevel.addFirst(node.val);
        }

        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
    }
}

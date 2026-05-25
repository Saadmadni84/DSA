class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i, n);
                provinces++;
            }
        }
        return provinces;
    }
    private void dfs(int[][] graph, boolean[] visited, int i, int n) {
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == 1 && !visited[j]) {
                dfs(graph, visited, j, n);
            }
        }
    }
}

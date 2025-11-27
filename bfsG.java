import java.util.*;
public class bfsG {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[][] graph = new boolean[n][n];
        for (boolean[] row : graph)
            Arrays.fill(row, false);

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++)
            vis[i] = false;

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (curr == destination) return true;

            for (int i = 0; i < n; i++) {
                if (graph[curr][i] == true && !vis[i]) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }

        return false;
    }
}

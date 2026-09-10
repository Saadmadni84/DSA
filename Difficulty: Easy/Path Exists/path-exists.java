class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
       List<Integer>[] graph = new ArrayList[V];
               for (int i = 0; i < V; i++) {
                   graph[i] = new ArrayList<>();
               }

               for (int[] edge : edges) {
                   graph[edge[0]].add(edge[1]);
                   graph[edge[1]].add(edge[0]);
               }

             
               boolean[] vis = new boolean[V];
               return dfs(graph, src, dest, vis);
           }

           private boolean dfs(List<Integer>[] graph, int curr, int dest, boolean[] vis) {
               if (curr == dest) return true;
               vis[curr] = true;

               for (int neighbor : graph[curr]) {
                   if (!vis[neighbor]) {
                       if (dfs(graph, neighbor, dest, vis)) {
                           return true;
                       }
                   }
               }
               return false;
           }
       }
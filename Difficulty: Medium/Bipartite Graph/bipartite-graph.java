class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int[] c = new int[V];

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(c[i]==0){
                c[i]=1;
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int neighbors:graph.get(node)){
                       if(c[neighbors]==0){
                           c[neighbors]=-c[node];
                           q.add(neighbors);
                       } 
                       else if (c[neighbors] == c[node]) {
                            return false;
                        }
                    }
                }
            }
        }
     return true;
        
        
    }
}
class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
     ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
     for (int i = 0; i < V; i++) {
                 adj.add(new ArrayList<>());
             }
     for(ArrayList<Integer> edge:edges){
         int u=edge.get(0);
         int v=edge.get(1);
         adj.get(u).add(v);
         adj.get(v).add(u);
     }
     boolean[] vis=new boolean[V];
     int c=0;
      for(int i=0;i<V;i++){
          if(!vis[i]){
              c++;
              dfs(i,adj,vis);
          }
      }
      return c;
        
    }
    private void dfs(int j, ArrayList<ArrayList<Integer>> adj, boolean [] vis){
        vis[j]=true;
        for(int ne:adj.get(j)){
            if(!vis[ne])
            dfs(ne,adj,vis);
        }
    }
}
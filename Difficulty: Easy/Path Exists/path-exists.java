class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
       Map<Integer,List<Integer>> graph=new HashMap<>();
       for(int [] edge:edges){
           int u=edge[0],v=edge[1];
           graph.computeIfAbsent(u,value ->new ArrayList<>()).add(v);
           graph.computeIfAbsent(v,value ->new ArrayList<>()).add(u);
       }
       boolean [] vis=new boolean[V];
       return dfs(graph,src,dest,vis,V);
        
    }
    private boolean dfs(Map<Integer,List<Integer>> graph,int s,int d,boolean [] vis,int n){
        if(s==d){
            return true;
        }
        vis[s]=true;
       for(int nb:graph.getOrDefault(s, new ArrayList<>())){
           if (!vis[nb]) {
                if (dfs(graph, nb, d, vis, n))
                    return true;
            }
       }
       return false;
    }
}

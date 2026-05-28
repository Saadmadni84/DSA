class Solution {
    public boolean helper(int node, int color, int[] c, int[][] graph){
        c[node]=color;
        for(int neighbor:graph[node]){
            if (c[neighbor] == 0) {
                if (!helper(neighbor, -color, c, graph)) {
                    return false;
                }
            }
            else if (c[neighbor] == color) {
                return false;
            }
        }
        return true;
        }
    
    public boolean isBipartite(int[][] graph) {
       int n=graph.length;
       int [] c=new int[n];
       for(int i=0;i<n;i++){
        if(c[i]==0){
            if(!helper(i,1,c,graph)){
            return false;
        }
       }
    }
    return true;
}
}

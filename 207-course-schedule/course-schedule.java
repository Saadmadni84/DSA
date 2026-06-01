class Solution {
    public boolean canFinish(int n, int[][] ps) {
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++){
           g.add(new ArrayList<>());
        }
        for(int [] p:ps){
            g.get(p[0]).add(p[1]);//directed so only one side
        }
        boolean [] visiting =new boolean[n];
        boolean [] visited =new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(!dfs(i,n,g,visiting,visited)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int curr,int n,List<List<Integer>> g,boolean [] visiting,boolean [] visited){
        visiting[curr]=true;
        for(int ne:g.get(curr)){
            if(visiting[ne]==true){ //cycle detecte
                return false;
            }
            if(!visited[ne]){
                if(!dfs(ne,n,g,visiting,visited)){
                    return false;
                }
            }
        }
        visiting[curr]=false;
        visited[curr]=true;
        return true;
    }
}
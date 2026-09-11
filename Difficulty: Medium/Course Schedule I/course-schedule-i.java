class Solution {
    public boolean canFinish(int n, int[][] pre) {
         List<List<Integer>> g=new ArrayList<>();
                for(int i=0;i<n;i++){
                    g.add(new ArrayList<>());
                }
                for(int [] p:pre){
                    g.get(p[0]).add(p[1]);
                }
                boolean [] visiting=new boolean[n];
                boolean [] visited=new boolean[n];
                for(int i=0;i<n;i++){
                    if(!visited[i]){
                        if(!dfs(i,g,n,visiting,visited))
                           return false;
                    }
                }
                return true;

            }
            private boolean dfs(int i, List<List<Integer>> g,int n, boolean [] visiting, boolean [] visited){
                visiting[i]=true;
                for(int ne:g.get(i)){
                    if(visiting[ne]==true){
                        return false;
                    }
                    if(!visited[ne]){
                        if(!dfs(ne,g,n,visiting,visited))
                            return false;
                    }
                }
                visiting[i]=false;
                visited[i]=true;
                return true;
            }
        }
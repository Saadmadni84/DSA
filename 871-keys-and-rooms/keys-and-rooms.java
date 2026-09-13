class Solution {
      int visc=0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
      
        dfs(rooms,vis ,0);
        return visc==n;
    }
    private void dfs(List<List<Integer>> rooms, boolean[] vis ,int i){
        vis[i]=true;
          visc++;
        for(int key:rooms.get(i)){
            if(!vis[key]){
              
                dfs(rooms,vis,key);
            }
        }
    }
}
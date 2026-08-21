class Solution {
    public int countIslands(char[][] g) {
    int m=g.length;
    int n=g[0].length;
      boolean[][] vis=new boolean[m][n];
      int res=0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(vis[i][j]!=true && g[i][j]=='L'){
                 dfs(g,vis,i,j);
                 res++;  
              }
             
          }
      }
      return res;
    }
    private void dfs(char[][] g, boolean[][] vis,int i,int j){
        vis[i][j]=true;
        int[][] dir = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };
        for(int k=0;k<8;k++){
            int newi=i+dir[k][0];
            int newj=j+dir[k][1];
            if(isSafe(newi,newj,g) && !vis[newi][newj] && g[newi][newj]=='L'){
                dfs(g,vis,newi,newj);
            }
        }
    }
        private boolean isSafe(int i,int j,char [][] grid){
                 int m=grid.length;
                int n=grid[0].length;
                return (i>=0 && j>=0 && i<m && j<n);
            }
}

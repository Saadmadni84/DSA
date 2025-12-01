class Solution {
    public int numIslands(char[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     boolean[][] vis=new boolean[m][n];
     int res=0;
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1' && !vis[i][j]){
                 res++;
                 dfs(i,j,m,n,grid,vis);
            }  
        }
     } 
     return res;
    }
     private void dfs(int i,int j,int m,int n,char[][] grid,boolean[][] vis){
        vis[i][j]=true;
        int [][] direc={{0,-1},{0,1},{-1,0},{1,0}};
        
        for(int k=0;k<4;k++){
            int newi=i+direc[k][0];
            int newj=j+direc[k][1];
            if(isSafe(newi,newj,m,n) && grid[newi][newj]=='1' && !vis[newi][newj]){
              dfs(newi,newj,m,n,grid,vis);

            }
        }
     } 
     private boolean isSafe(int newi,int newj,int m,int n){
        return (newi>=0 && newj>=0 && newi<m && newj<n);
     }
}
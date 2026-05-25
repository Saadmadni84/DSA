class Solution {
    public int countIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='L' && !vis[i][j]){
                    res++;
                    dfs(i,j,m,n,grid,vis);
                }
            }
        }
        return res;
        
    }
    private void dfs(int i,int j,int m,int n,char [][] g,boolean[][] vis){
        vis[i][j]=true;
        int[][] dir = {
                {0,-1},   // left
                {0,1},    // right
                {-1,0},   // up
                {1,0},    // down
            
                {-1,-1},  // upper-left
                {-1,1},   // upper-right
                {1,-1},   // lower-left
                {1,1}     // lower-right
            };
        
        for(int k=0;k<8;k++){
            int newi=i+dir[k][0];
            int newj=j+dir[k][1];
            if(isSafe(newi,newj,m,n) && !vis[newi][newj] && g[newi][newj]=='L'){
                dfs(newi,newj,m,n,g,vis);
            }
        }
    }
    private boolean isSafe(int newi,int newj,int m,int n){
        return (newi>=0 && newj>=0 && newi<m && newj<n);
     }
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     int res=0;
     boolean [][] vis=new boolean[m][n];
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1 && !vis[i][j]){
                res=Math.max(res,dfs(i,j,grid,vis)); 
    
                 
            }
        }
     }
     return res;   
    }
    private int dfs(int i,int j,int[][] g,boolean[][] vis){
        vis[i][j]=true;
        int area=1;
        int [][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int k=0;k<4;k++){
            int newi=i+dir[k][0];
            int newj=j+dir[k][1];
            if(isSafe(newi,newj,g) && g[newi][newj]==1 && !vis[newi][newj]){
                area=area+dfs(newi,newj,g,vis);
                    
            }
          
        }
        
          return area;
    }
    private boolean isSafe(int i,int j,int [][] grid){
         int m=grid.length;
        int n=grid[0].length;
        return (i>=0 && j>=0 && i<m && j<n);
    }
}
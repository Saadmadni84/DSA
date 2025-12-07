class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int n =mat.length;
       int m=mat[0].length;
       boolean [][] vis=new boolean [n][m];
       int [][] dist=new int[n][m];
       Queue<int[]> q = new LinkedList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){
                q.add(new int []{i,j});
                vis[i][j]=true;
            }
        }
       }
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    while(!q.isEmpty()){
        int [] cell=q.remove();
        int r=cell[0];
        int c=cell[1];
        for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc]) {
                    dist[nr][nc] = dist[r][c] + 1;
                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return dist;
    }
}
    
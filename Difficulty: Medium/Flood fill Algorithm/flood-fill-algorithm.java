class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int nc) {
      int og=image[sr][sc];
      if(og==nc){
          return image;
      }
      dfs(image,sr,sc,nc,og);
      return image;
     
           
    }
    private void dfs(int [][] image ,int r, int c, int nc,int og){
        if(r<0 || c<0 || r>=image.length || c >=image[0].length){
            return;
        }
        if(image[r][c]!=og){
            return;
        }
        image[r][c]=nc;
        int [][] k={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<4;i++){
            int newr=r+k[i][0];
            int newc=c+k[i][1];
            dfs(image,newr,newc,nc,og);
        }
    }
}
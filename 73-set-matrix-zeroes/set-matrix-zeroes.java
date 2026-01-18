class Solution {
    public void setZeroes(int[][] a) {
       int m=a.length;
       int n=a[0].length;

       boolean [] r=new boolean[m];
       boolean [] c=new boolean[n];

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]==0){
              r[i]=true;
              c[j]=true;
            }
           
        }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(r[i] || c[j]){
                a[i][j]=0;
            }
           
        }
       }
    }
}
class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int [][] m=new int[n][n];
         int t=0;
        int b=n-1;
        int l=0;
        int r=n-1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                m[t][i]=k;
                k++;
            }
            t++;
            for(int i=t;i<=b;i++){
                m[i][b]=k;
                k++;
            }
            r--;
            if(!(t<=b && l<=r)){
            break;
            }
            for(int i=r;i>=l;i--){
                m[b][i]=k;
                k++;
            }
            b--;
            for(int i=b;i>=t;i--){
                    m[i][l]=k;
                    k++;
            }
            l++;       
            }
            return m;
    }
}
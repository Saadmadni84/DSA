class Solution {
    public boolean searchMatrix(int[][] m, int x) {
       int l=0;
       int h=(m.length*m[0].length)-1;
       while(l<=h){
           int md=(l+h)/2;
           int r=md/m[0].length;
           int c=md%m[0].length;
           if(m[r][c]==x){
               return true;
           }
           else if(m[r][c]<x){
               l++;
           }
           else{
               h--;
           }
       }
       return false;
    }
}

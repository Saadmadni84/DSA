class Solution {
    public boolean searchMatrix(int[][] a, int t) {
       int l=0,h=(a.length*a[0].length-1);
       while(l<=h){
        int mid=(l+h)/2;
        int r=mid/a[0].length,c=mid%a[0].length;
        if(a[r][c]==t){
            return true;
        }
        else if(t<a[r][c]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
     }
     return false;
    }
    
}
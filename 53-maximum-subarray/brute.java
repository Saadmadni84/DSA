class Solution {
    public int maxSubArray(int[] a) {
        
        int con=a[0];
        for(int i=0;i<a.length;i++){
            int res=0;
            for(int j=i;j<a.length;j++){
                res=res+a[j];
                if(res>con){
                    con=res;
                }
            }     

        }
        return con;
    }       
}

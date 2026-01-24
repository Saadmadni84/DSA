class Solution {
    public int maxProduct(int[] n) {
        int res=n[0];
        for(int i=0;i<n.length;i++){
            int m=1;
            for(int j=i;j<n.length;j++){
                m=m*n[j];
                res=Math.max(m,res);
            }
        }
        return res;
    }
}
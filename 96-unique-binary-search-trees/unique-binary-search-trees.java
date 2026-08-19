class Solution {
    public int numTrees(int n) {
        if(n<=1){
            return 1;
        }
        long c=1;
        for(int i=1;i<=n;i++){
            c=c*2*(2*i-1)/(i+1);
        }
        return (int)c;
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        long j=num/2;
        if(num==1){
            return true;
        }
        while(i<=j){
            long m=(i+j)/2;
            long sq=m*m;
            if(sq==num){
                return true;
            }
            else if(sq>num){
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return false;
    }
}
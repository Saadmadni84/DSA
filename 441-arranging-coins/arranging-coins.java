class Solution {
    public int arrangeCoins(int n) {
        int sum=n;
        int i=1;
       while(sum>=0){
        sum=sum-i;
        i++;
       }
       return i-2;
    }
}
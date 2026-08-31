class Solution {
    public int buyChoco(int[] p, int m) {
       Arrays.sort(p); 
    
       int sum=m-p[0]-p[1];
       if(sum<0){
        return m;
       }
       return sum;
    }
}
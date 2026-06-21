class Solution {
    public int maxArea(int[] h) {
       int n=h.length;
       int max=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int sum=Math.min(h[i],h[j])*(j-i);
            if(sum>max){
                max=sum;
            }
        }
       }
       return max;
    }
}

class Solution {
    public int maxArea(int[] h) {
       int n=h.length;
       int max=0;
       int i=0;
       int j=n-1;
       while(i<j){
        int sum=Math.min(h[i],h[j])*(j-i);
        if(sum>max){
            max=sum;
        }
        if(h[i]>h[j]){
            j--;
        }
        else{
            i++;
        }
       }
       return max;
    }
}
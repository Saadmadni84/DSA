class Solution {
    public int maxArea(int[] h) {
       int n=h.length;
       int max=0;
       int i=0;
       int j=n-1;
       while(i<j){
        int ch=Math.min(h[i],h[j]);
        int a=ch*(j-i);
        if(a>max){
            max=a;
        }
        if(h[i]<h[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return max;
    }
}
class Solution {
    public int triangleNumber(int[] a) {
        int count=0;
        Arrays.sort(a);
        int n=a.length;
        for(int k=n-1;k>=2;k--){
            int i=0;
            int j=k-1;
            while(i<j){
                if(a[i]+a[j]>a[k]){
                    count =count+j-i;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return count;
    }
}
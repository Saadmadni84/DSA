class Solution {
    public void moveZeroes(int[] a) {
        int i=0;
        int j=1;
        while(j<a.length){
            if(a[i]==0 && a[j]!=0){
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[i]==0 && a[j]==0){
               j++;

            }
            else{
                i++;
                j++;
            }
        } 
    }
    private void swap(int [] a,int i,int j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        
        int i=0;
        int m=0;
        int c =0;
        while(i<a.length){
             
            if(a[i]==1){
               c++;   
            }
            else{
                c=0;
            }
            i++;
            if(c>m){
                m=c;
               }
    
        }
        return m;
    }
}
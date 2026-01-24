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
                if(c>m){
                m=c;
               }
                c=0;
            }
            i++;
            
    
        }
        return Math.max(m,c);
    }
}
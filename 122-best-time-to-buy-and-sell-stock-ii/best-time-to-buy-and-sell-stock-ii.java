class Solution {
    public int maxProfit(int[] pr) {
       int p=0;
       int i=0;
       int j=1;
       while(j<pr.length){
        if(pr[i]<pr[j]){
            p=p+pr[j]-pr[i];
           
        }
         i++;
         j++;
     
       } 
       return p;
    }
}
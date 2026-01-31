class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int m=1;
        int i=0;
        while(i<arr.length){
            if(arr[i]!=m){
                count++;
                if(count==k){
                    return m;
                }
                    
            }
            else{
                i++;
                 
            }
             m++;   
           
        }
        while(count<k){
            count++;
            m++;
        }
        return m-1;
       

    }
}
class Solution {
    public int klengthpref(String[] arr, int k, String str) {
       if(str.length()<k){
           return 0;
       }
       String strp = str.substring(0, k);
       int c=0;
       for(int i=0;i<arr.length;i++){
           String res = arr[i].substring(0, Math.min(k, arr[i].length()));
           if(res.equals(strp)){
               c++;
           }
       }
       return c;
    }
}
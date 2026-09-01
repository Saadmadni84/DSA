class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=s.charAt(s.length()-1);
        int one=0;
        int i=0;
        int j=0;
        while(j<s.length()){
           if(s.charAt(j)=='1'){
            one++;
           }
           j++;
        }
        String t = "1";
        one--;
        int zeros = s.length() - 1 - one;
         while (i < zeros) {
            t = '0' + t;
            i++;
        }
        while(one>0){
            t='1'+t;
            one--;
        }
        return t;
    }
}
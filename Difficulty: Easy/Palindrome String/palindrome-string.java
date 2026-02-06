class Solution {
    boolean isPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       if(s.length()==0){
           return true;
       }
       while(i<=j){
           if(s.charAt(i)!=s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
        
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(t.length()==0 && s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
      while(i<s.length()){
        char c=s.charAt(i);
         if(j>t.length()-1){
                return false;
            }
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                break;
            }
            else if(j==t.length()-1){
                return false;
            }
            j++;
        }
        i++;
      }
      return true;
    }
}
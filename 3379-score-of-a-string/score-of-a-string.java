class Solution {
    public int scoreOfString(String s) {
        int sc=0;
        int i=0;
        int j=1;
        while(j<s.length()){
          sc=sc+Math.abs((int)s.charAt(i)-(int)s.charAt(j));
          i++;
          j++;
        }
         
    
        return sc;
    }
}
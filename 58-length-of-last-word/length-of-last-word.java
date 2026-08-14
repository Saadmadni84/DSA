class Solution {
    public int lengthOfLastWord(String s) {
      s=s.trim();
      int j=s.length()-1;
      int c=0;
      while(j>=0 && s.charAt(j)!=' '  ){
        j--;
        c++;
      }
      return c;
    }
}
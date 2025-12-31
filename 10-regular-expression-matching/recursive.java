class Solution {
    boolean helper(String s, String p,int i,int j){
        if(i<0 && j<0){
            return true;
        }
        if(j<0){
            return false;
        }
        if(i<0){
            if (p.charAt(j) == '*') {
                return helper(s, p, i, j - 2);
            }
            return false;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
           return  helper(s,p,i-1,j-1);
        }
        if(p.charAt(j)=='*'){
           return  helper(s,p,i,j-2) || ((s.charAt(i)==p.charAt(j-1) || p.charAt(j-1)=='.')
           && helper(s,p,i-1,j));
            }

        return false;
    }

    public boolean isMatch(String s, String p) {
        int i=s.length();
        int j=p.length();
     return helper(s, p,i-1,j-1);   
    }
}

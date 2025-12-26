class Solution {
    boolean helper(String s, String p,int i,int j){
        if(s.length()==i && p.length()==j){
            return true;
        }
        if(p.length()<=j){
            return false;
        }
        if(s.length()<=i){
            if(p.charAt(j)=='*'){
               return helper(s,p,i,j+1);
            }
            return false;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
           return  helper(s,p,i+1,j+1);
        }
        if(p.charAt(j)=='*'){
           return  helper(s,p,i,j+1) || helper(s,p,i+1,j);
        }
        return false;
    }
    public boolean isMatch(String s, String p) {
     return helper(s, p,0,0);
    }
}

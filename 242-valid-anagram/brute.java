class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       } 
       List<Character> u=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        u.add(s.charAt(i));
       }
       for(int j=0;j<t.length();j++){
        if(!u.contains(t.charAt(j))){
            return false;
        }
        u.remove((Character) t.charAt(j));;
       }
       return true;
    }
}

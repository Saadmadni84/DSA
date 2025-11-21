class Solution {
    public List<String> letterCombinations(String d) {
    Map<Character,String> m=new HashMap<>();
    m.put('2',"abc"); 
    m.put('3', "def");
    m.put('4', "ghi");
    m.put('5', "jkl");
    m.put('6', "mno");
    m.put('7', "pqrs");
    m.put('8', "tuv");
    m.put('9', "wxyz");
    StringBuilder s =new StringBuilder();
    List<String> res=new ArrayList<>();
    if(d.length()==0){
        return res;
    }
    backtrack(0,d,s,m,res); 
    return res; 
    }
    public void backtrack(int idx,String d,StringBuilder s,Map<Character,String> m,   List<String> res){
        if(s.length()==d.length()){
            res.add(s.toString());
            return;
        }
        char c=d.charAt(idx);
        String choice=m.get(c);
        for(char ch:choice.toCharArray()){
            s.append(ch);
            backtrack(idx+1,d,s,m,res);
            s.deleteCharAt(s.length()-1);
        }
    }
}
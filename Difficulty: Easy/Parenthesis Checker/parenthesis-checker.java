class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> sp=new Stack<>();
        char p;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{'){
               sp.push('{');
            }
            else if(c=='['){
                 sp.push('[');
            }
            else if(c=='('){
                 sp.push('(');
            }
              else if(c == '}') {
               
                if (sp.isEmpty()) return false; 
                p = sp.pop();
                if (p != '{') {
                    return false;
                }
            } else if(c == ']') {
                
                if (sp.isEmpty()) return false; 
                p = sp.pop();
                if (p != '[') {
                    return false;
                }
            } else if(c == ')') { 
                if (sp.isEmpty()) return false; 
                p = sp.pop();
                if (p != '(') {
                    return false;
                }
            }
        }
        if(!sp.isEmpty()){
            return false;
        }
        return true;
    }
}

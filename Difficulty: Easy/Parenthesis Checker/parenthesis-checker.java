class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st=new Stack();
       for(char c:s.toCharArray()){
           if(c=='('){
               st.push(')');
           }
           else if(c=='{'){
               st.push('}');
           }
           else if(c=='['){
               st.push(']');
           }
           else if(st.isEmpty() || st.pop()!=c){
               return false;
           }
       }
       return st.isEmpty();
    }
}

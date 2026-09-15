class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        int[] dp = new int[s.length()];
        int i=0;
        int max=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
              if(!st.isEmpty()){
                  int li=st.pop();
                    int ci=i-li+1;
                    int pi=li>0?dp[li-1]:0;
                    dp[i]=ci+pi;
                    max=Math.max(dp[i],max);

              }
            }
            i++;
        }
        return max;
    }
}
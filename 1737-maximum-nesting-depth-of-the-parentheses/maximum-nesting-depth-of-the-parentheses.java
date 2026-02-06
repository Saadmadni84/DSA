class Solution {
    public int maxDepth(String s) {
    StringBuilder ans = new StringBuilder();
        int depth = 0;
        int max=0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                max=Math.max(depth,max);
            } else if(c == ')'){ 
                depth--;
            }
            else{

            }
        }
        return max;
    }
}

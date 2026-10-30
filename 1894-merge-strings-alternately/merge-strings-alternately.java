class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0;
        int j=0;
        String m="";
        while(i<w1.length() && j<w2.length()){
            m=m+w1.charAt(i);
            m=m+w2.charAt(j);
            i++;
            j++;
        }
        while(i<w1.length()){
            m=m+w1.charAt(i);
            i++;
        }
         while(j<w2.length()){
            m=m+w2.charAt(j);
            j++;
        }
        return m;
        
    }
}
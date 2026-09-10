class Solution {
    public int longestUniqueSubstr(String s) {
     int [] ls=new int[126];
     Arrays.fill(ls,-1);
     int l=0;
     int mlength=0;
     for(int r=0;r<s.length();r++){
         char c=s.charAt(r);
         if(ls[c]>=l){
             l=ls[c]+1;
         }
         ls[c]=r;
         mlength=Math.max(mlength,r-l+1);
     }
     return mlength;
        
    }
}
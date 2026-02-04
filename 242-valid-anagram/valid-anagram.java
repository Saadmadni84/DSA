class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        int countS[]= new int[26];
        int countT[]= new int[26];
        for(char ch:s.toCharArray()){
            countS[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            countT[ch-'a']++;
        }
        return Arrays.equals(countS,countT);
      }
}
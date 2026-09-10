class Solution {
    public int firstUniqChar(String s) {
      Map<Character,Integer> m=new HashMap<>();
      for (char ch : s.toCharArray()) {
         m.put(ch, m.getOrDefault(ch, 0) + 1);
      }
      int i=0;
      for(char ch:s.toCharArray()){
        if(m.get(ch)==1){
            return i;
        }
        i++;
      }
      return -1;
    }
}
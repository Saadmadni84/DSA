class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s:arr){
           char []c= s.toCharArray();
           Arrays.sort(c);
           String sor=new String(c);
        
          if (!map.containsKey(sor)) {
                map.put(sor, new ArrayList<>());
            }
            map.get(sor).add(s);
        }
         return new ArrayList<>(map.values());
    }
}

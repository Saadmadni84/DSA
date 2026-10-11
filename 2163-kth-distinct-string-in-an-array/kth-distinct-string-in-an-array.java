class Solution {
    public String kthDistinct(String[] arr, int k) {
      Map<String,Integer> sp=new HashMap<>();
      for(String s:arr){
        sp.put(s,sp.getOrDefault(s,0)+1);
      }
      int c=0;
      for(String s:arr){
          if(sp.get(s)==1){
            c++;
            if(c==k){
                return s;
            }
          }
      }
      return "";
    }
}
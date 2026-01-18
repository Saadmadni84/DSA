class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> outer =new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ls.add(1);
                }
                else{
                    ls.add(outer.get(i-1).get(j-1)+outer.get(i-1).get(j));
                }
            }
             outer.add(ls);
        }
       
        return outer;
    }
}
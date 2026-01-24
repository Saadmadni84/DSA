class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> ls=new ArrayList<>();
      int t=0;
      int b=a.length-1;
      int l=0;
      int r=a[0].length-1;
     
      while(t<=b && l<=r){
        for(int i=l;i<=r;i++){
            ls.add(a[t][i]);
        }
        t++;
        for(int i=t;i<=b;i++){
            ls.add(a[i][r]);
        }
        r--;
        if(!(t<=b && l<=r)){
            break;
        }
        for(int i=r;i>=l;i--){
            ls.add(a[b][i]);
        }
        b--;
        for(int i=b;i>=t;i--){
            ls.add(a[i][l]);
        }
        l++;       
      }
      return ls;
 }
}
class Solution {
     private void dfs(int num,int n, List<Integer> res,int k){
            if(n==0){
                res.add(num);
                return;
            }
            int ld=num%10;
            if(ld+k<=9){
                dfs(num*10+ld+k,n-1,res,k);
            }
            if(k!=0 && ld-k>=0){
                dfs(num*10+ld-k,n-1,res,k);
            }
     }
    public int[] numsSameConsecDiff(int n, int k) {
       
        
        List<Integer> res=new ArrayList<>();
        for(int num=1;num<=9;num++){
            dfs(num,n-1,res,k);
        }
        int [] ress=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ress[i]=res.get(i);
        }
        return ress;
    }
}
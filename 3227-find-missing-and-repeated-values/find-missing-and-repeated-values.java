class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        Set<Integer> s=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c++;
                if(s.contains(grid[i][j])){
                    ls.add(grid[i][j]);
                }
                else{
                    s.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<c;i++){
            if(!s.contains(i)){
                ls.add(i);
            }
        }
        int [] a=new int [ls.size()];
        for(int i=0;i<ls.size();i++){
             a[i]=ls.get(i);
        }
        return a;
    }
}
class Solution {
    public boolean makesquare(int[] ms) {
     if(ms.length<4){
        return false;
     }
     int total=0;
     for(int i=0;i<ms.length;i++){
        total+=ms[i];
     }
     if(total%4!=0){
        return false;
     }
     int target=total/4;
     Arrays.sort(ms);
     if(ms[ms.length-1]>target){
        return false;
     }
     int [] sides=new int[4];
     return helper(ms,ms.length-1,sides,target);  
    }
    private boolean helper(int [] ms,int i,int [] sides,int t){
        if(i<0){
            return true;
        }
        int stick=ms[i];
        for(int k=0;k<4;k++){
            if(sides[k]+stick<=t){
                sides[k]+=stick;
                if (helper(ms, i- 1, sides, t)) {
                    return true;
                }
                sides[k]-=stick;
            }
            if(sides[k]==0){
                break;
            }
    
        }
        return false;
    }
}
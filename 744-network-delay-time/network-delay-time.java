class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int [] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        for(int i=1;i<n;i++){ //n-1 times bellman ford
           for(int [] t:times){
                int u=t[0],v=t[1],w=t[2];
                if(dist[u]+w<dist[v] && dist[u]!=Integer.MAX_VALUE){
                    dist[v]=dist[u]+w; //relaxation
                }
            }
        }
        int res=-1;
        for(int i=1;i<=n;i++){
            res=Math.max(res,dist[i]);
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
}
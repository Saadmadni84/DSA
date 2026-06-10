class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int [][] g=new int[n][n]; //forming graph
        //connecting all nodes
        for(int i=0;i<n;i++){
           int [] p=points[i];
           for(int j=0;j<n;j++){
            if(j==i) continue; //same number to same
            g[i][j]=Math.abs(p[0]-points[j][0])+Math.abs(p[1]-points[j][1]);
           }
        }
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[] {0,0});
        int [] vis=new int[n];
        int res=0;
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int cost=curr[0];
            int node=curr[1];
            if(vis[node]==1){ 
                continue;
            }
            vis[node]=1;
            res=res+cost;
            for(int i=0;i<n;i++){
                if(vis[i]==0){
                    pq.offer(new int [] {g[node][i],i});
                                        //cost.    neighbour
                }
            }
        }
        return res;
    }
}

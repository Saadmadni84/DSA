class Solution {
    public int findDelayTime(int V, int[][] edges, int src) {
       List<List<int []>> g=new ArrayList<>();
        for(int i=0;i<=V;i++){
           g.add(new ArrayList<>());
        } 
        for(int [] edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            g.get(u).add( new int[]{v,w});
        }
        int [] dist=new int[V+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        
        PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,src});
        
        while(!pq.isEmpty()){
            int [] top=pq.poll();
            int nodedist=top[0];
            int node=top[1];
            
            for(int [] ne:g.get(node)){
                int adjnode=ne[0];
                int adjnodedist=ne[1];
                
                if(dist[adjnode]>dist[node]+adjnodedist){
                    dist[adjnode]=dist[node]+adjnodedist;
                    pq.offer(new int []{dist[adjnode],adjnode});
                }
            }
        }
       int res = 0;
       for(int i = 0; i < V; i++){
       if(dist[i] == Integer.MAX_VALUE){
       return -1;
        }
        res = Math.max(res, dist[i]);
       }

       return res;
    }
}

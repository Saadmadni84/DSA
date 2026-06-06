class Solution {
    public int findCheapestPrice(int n, int[][] flights,
                                 int src, int dst, int k) {

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int price = flight[2];

            graph.get(u).add(new int[]{v, price});
        }
        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src, 0});
        dist[src][0] = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int cost = curr[0];
            int node = curr[1];
            int stops = curr[2];
            if (node == dst) {
                return cost;
            }
            if (stops > k) {
                continue;
            }
            for (int[] nei : graph.get(node)) {
                int nextNode = nei[0];
                int price = nei[1];
                int newCost = cost + price;
                if (newCost < dist[nextNode][stops + 1]) {
                    dist[nextNode][stops + 1] = newCost;
                    pq.offer(new int[]{
                            newCost,
                            nextNode,
                            stops + 1
                    });
                }
            }
        }
        return -1;
    }
}
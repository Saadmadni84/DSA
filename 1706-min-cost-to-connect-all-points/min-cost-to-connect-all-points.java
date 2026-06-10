class Solution {
// prims solution is on github and in copy visit that its easy
    class DisjointSet {
        int[] parent;
        int[] rank;

        public DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // Path Compression
            }
            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                return false;
            }

            // Union by Rank
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }

            return true;
        }
    }

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;
        List<int[]> edges = new ArrayList<>();

        // Create all possible edges
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int cost = Math.abs(points[i][0] - points[j][0]) +
                           Math.abs(points[i][1] - points[j][1]);

                edges.add(new int[]{cost, i, j});
            }
        }

        // Sort edges by cost
        Collections.sort(edges, (a, b) -> a[0] - b[0]);

        DisjointSet ds = new DisjointSet(n);

        int totalCost = 0;
        int edgesUsed = 0;

        // Kruskal's Algorithm
        for (int[] edge : edges) {

            int cost = edge[0];
            int u = edge[1];
            int v = edge[2];

            if (ds.union(u, v)) {
                totalCost += cost;
                edgesUsed++;

                if (edgesUsed == n - 1) {
                    break;
                }
            }
        }

        return totalCost;
    }
}
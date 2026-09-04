class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] scores = new int[n + 1];
    
        for (int[] relation : trust) {
            scores[relation[0]]--; 
            scores[relation[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (scores[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0, sum = 0;
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }

        // Brute force: try every capacity
        for (int capacity = max; capacity <= sum; capacity++) {
            if (canShip(weights, days, capacity)) {
                return capacity;
            }
        }
        return -1; // never reached
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return requiredDays <= days;
    }
}

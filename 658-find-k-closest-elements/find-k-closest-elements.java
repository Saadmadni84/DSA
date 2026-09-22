class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);
            if (distA != distB) {
                return Integer.compare(distB, distA); 
            }
            return Integer.compare(b, a); 
        });

        for (int num : arr) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }
        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.sort(result); 
        return result;  

    }
}
class Solution {
    public int cntSubarrays(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int sum = 0;
        int answer = 0;
        
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                answer += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return answer;
    }
}
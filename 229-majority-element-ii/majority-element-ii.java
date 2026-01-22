class Solution {
    public List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<>();
    List<Integer> ls=new ArrayList<>();
    int n = nums.length;
    for (int num : nums) {
        counts.put(num, counts.getOrDefault(num, 0) + 1);
        if (counts.get(num) > n / 3 && !ls.contains(num)) {
            ls.add(num);
        }
    }
    return ls;
}
    
}
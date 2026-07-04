class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=arr.length;
        int maxlen=0;
        int sum=0;
        m.put(0,-1);
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(m.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-m.get(sum-k));
            }
            m.putIfAbsent(sum,i);
        }
        return maxlen;
    }
}

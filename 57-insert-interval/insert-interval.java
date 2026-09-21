class Solution {
    public int[][] insert(int[][] arr, int[] ni) {
        List<int[]> ls = new ArrayList<>();
        int i = 0;
        int n = arr.length;
        while (i < n && arr[i][1] < ni[0]) {
            ls.add(arr[i]);
            i++;
        }
        while (i < n && arr[i][0] <= ni[1]) {
            ni[0] = Math.min(ni[0], arr[i][0]);
            ni[1] = Math.max(ni[1], arr[i][1]);
            i++;
        }
        ls.add(ni);
        while (i < n) {
            ls.add(arr[i]);
            i++;
        }

        return ls.toArray(new int[ls.size()][]);
    }
}
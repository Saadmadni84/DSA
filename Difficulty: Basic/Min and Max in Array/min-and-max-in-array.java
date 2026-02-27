import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(min);
        ls.add(max);
        return ls;
    }
}
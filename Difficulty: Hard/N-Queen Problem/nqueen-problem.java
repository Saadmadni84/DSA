import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        
        solve(1, n, current, result);
        
        return result;
    }

    private void solve(int col, int n, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (col > n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int row = 1; row <= n; row++) {
            if (isSafe(row, col, current)) {
                current.add(row);
                solve(col + 1, n, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isSafe(int row, int col, ArrayList<Integer> current) {
        for (int i = 0; i < current.size(); i++) {
            int placedRow = current.get(i);
            int placedCol = i + 1;

            if (placedRow == row) {
                return false;
            }

            if (Math.abs(placedRow - row) == Math.abs(placedCol - col)) {
                return false;
            }
        }
        
        return true;
    }
}
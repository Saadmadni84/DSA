class Solution {
    int count = 0;

    public void backtrack(int row,
                          Set<Integer> cols,
                          Set<Integer> diags,
                          Set<Integer> antiDiags,
                          int n) {

       
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

          
            if (cols.contains(col)) {
                continue;
            }

           
            int diag = row - col;
            if (diags.contains(diag)) {
                continue;
            }

           
            int antiDiag = row + col;
            if (antiDiags.contains(antiDiag)) {
                continue;
            }

           
            cols.add(col);
            diags.add(diag);
            antiDiags.add(antiDiag);

            
            backtrack(row + 1, cols, diags, antiDiags, n);

           
            cols.remove(col);
            diags.remove(diag);
            antiDiags.remove(antiDiag);
        }
    }

    public int totalNQueens(int n) {
        count = 0;

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diags = new HashSet<>();
        Set<Integer> antiDiags = new HashSet<>();

        backtrack(0, cols, diags, antiDiags, n);

        return count;
    }
}

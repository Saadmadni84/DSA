class Solution {

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(board[i][j] == word.charAt(0)){
                    visited[i][j] = true;

                    if(helper(0, i, j, board, word, visited)){
                        return true;
                    }

                    visited[i][j] = false;
                }
            }
        }

        return false;
    }

    private boolean helper(int curr, int i, int j, char[][] b, String w, boolean[][] visited){

        if(curr == w.length() - 1){
            return true;
        }

        // UP
        if(i-1 >= 0 && b[i-1][j] == w.charAt(curr+1) && !visited[i-1][j]){
            visited[i-1][j] = true;

            if(helper(curr+1, i-1, j, b, w, visited)){
                return true;
            }

            visited[i-1][j] = false;
        }

        // DOWN
        if(i+1 < b.length && b[i+1][j] == w.charAt(curr+1) && !visited[i+1][j]){
            visited[i+1][j] = true;

            if(helper(curr+1, i+1, j, b, w, visited)){
                return true;
            }

            visited[i+1][j] = false;
        }

        // LEFT
        if(j-1 >= 0 && b[i][j-1] == w.charAt(curr+1) && !visited[i][j-1]){
            visited[i][j-1] = true;

            if(helper(curr+1, i, j-1, b, w, visited)){
                return true;
            }

            visited[i][j-1] = false;
        }

        // RIGHT
        if(j+1 < b[0].length && b[i][j+1] == w.charAt(curr+1) && !visited[i][j+1]){
            visited[i][j+1] = true;

            if(helper(curr+1, i, j+1, b, w, visited)){
                return true;
            }

            visited[i][j+1] = false;
        }

        return false;
    }
}
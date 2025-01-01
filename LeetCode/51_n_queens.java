class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean board[][] = new boolean[n][n];
        queens(board, 0, result);
        return result;
    }

    public void queens(boolean[][] board, int row, List<List<String>> result){
        if(row == board.length){
            result.add(display(board));
            return;
        }
        // placing the queen and checking for every rol and col
        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row + 1, result);
                board[row][col] = false;
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col){
        // check for vertical row
        for(int i = 0 ; i < row ; i++){
            if(board[i][col]){
                return false;
            }
        }
        // diagonal left
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static List<String> display(boolean[][] board){
        List<String> solution = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder sb = new StringBuilder();
            for(boolean element : row){
                sb.append(element ? 'Q' : '.');
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}

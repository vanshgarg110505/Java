class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board, 0);
    }

    public int queens(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        
        int count = 0;
        // placing the queen and checking for every rol and col
        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
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
    int maxRight = Math.min(row, board.length - col - 1 );
    for(int i = 1; i <= maxRight; i++){
      if(board[row-i][col+i]){
        return false;
      }
    }
    return true;
    }
}
class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = 0, rookCol = 0;
        outer:
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(board[i][j] == 'R'){
                    rookRow = i;
                    rookCol = j;
                    break outer;
                }
            }
        }

        int count = 0;

        int directions[][] = {{-1,0}, {0,1}, {1, 0}, {0, -1}};

        for(int[] dir : directions){
            int x = rookRow;
            int y = rookCol;

            while(true){
                x += dir[0];
                y += dir[1];

                if(x < 0 || x >= 8 || y < 0 || y >= 8){
                    break;
                }

                if(board[x][y] == 'B'){
                    break;
                }

                if(board[x][y] == 'p'){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

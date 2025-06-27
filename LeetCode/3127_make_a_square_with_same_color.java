class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                int black = 0, white = 0;
                for(int r = i ; r <= i + 1 ; r++){
                    for(int c = j ; c <= j + 1 ; c++){
                        if(grid[r][c] == 'B'){
                            black++;
                        }
                        else{
                            white++;
                        }
                    }
                }

                if(black >= 3 || white >= 3){
                    return true;
                }
            }
        }
        return false;
    }
}

class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0 , front = 0, side = 0;
        for(int i = 0 ; i < n ; i++){
            int maxRow = 0, maxCol = 0;
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] > 0){
                    top++;
                }

                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            side += maxRow;
            front += maxCol;
        }
        return side + top + front;
    }
}

class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int height = grid[i][j];
                if(height > 0){
                    area += height * 6 - (height - 1) * 2;

                    if(i > 0){
                        area -= 2 * Math.min(grid[i][j], grid[i-1][j]);
                    }

                    if(j > 0){
                        area -= 2 * Math.min(grid[i][j], grid[i][j-1]);
                    }
                }
            }
        }
        return area;
    }
}

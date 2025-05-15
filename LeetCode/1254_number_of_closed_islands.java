class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0 ; i < row ; i++){
            dfs(grid, i , 0);
            dfs(grid, i , col - 1);
        }

        for(int j = 0 ; j < col ; j++){
            dfs(grid, 0 , j);
            dfs(grid, row - 1 , j);
        }

        int closedIslands = 0;
        for(int i = 1 ; i < row - 1 ; i++){
            for(int j = 1 ; j < col - 1 ; j++){
                if(grid[i][j] == 0){
                    dfs(grid, i , j);
                    closedIslands++;
                }
            }
        }
        return closedIslands;
    }

    public void dfs(int[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;

        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 0){
            return;
        }

        grid[i][j] = 2;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}

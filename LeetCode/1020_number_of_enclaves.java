class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0 ; i < row ; i++){
            dfs(grid, i, 0);
            dfs(grid, i , col - 1);
        }

        for(int j = 0 ; j < col ; j++){
            dfs(grid, 0 , j);
            dfs(grid, roaw - 1 , j);
        }

        int count = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;

        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1){
            return;
        }

        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}

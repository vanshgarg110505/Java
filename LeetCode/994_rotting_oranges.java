class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0){
            return 0;
        }

        int directions[][] = {{1,0}, {-1,0}, {0,1},{0,-1}};
        int minutes = -1;

        while(!queue.isEmpty()){
            int size = queue.size();
            minutes++;
            for(int i = 0 ; i < size ; i++){
                int cell[] = queue.poll();
                int r = cell[0];
                int c = cell[1];

                for(int d[] : directions){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if(nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        queue.add(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
        }
        return fresh == 0 ? minutes : -1; 
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int result[][] = new int[row][col];
        boolean visited[][] = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(mat[i][j] == 0){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        int directions[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!queue.isEmpty()){
            int cell[] = queue.poll();
            int r = cell[0];
            int c = cell[1];
            for(int d[] : directions){
                int newR = r + d[0];
                int newC = c + d[1];

                if(newR >= 0 && newR < row && newC >= 0 && newC < col && !visited[newR][newC]){
                    result[newR][newC] = result[r][c] + 1;
                    visited[newR][newC] = true;
                    queue.add(new int[]{newR, newC});
                }
            }
        }
        return result;
    }
}

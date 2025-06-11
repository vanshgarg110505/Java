class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<int[]> zeroes = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    zeroes.add(new int[]{i,j});
                }
            }
        }

        for(int pos[] : zeroes){
            int row = pos[0];
            int col = pos[1];

            for(int i = 0 ; i < m ; i++){
                matrix[i][col] = 0;
            }

            for(int j = 0 ; j < n ; j++){
                matrix[row][j] = 0;
            }
        }
    }
}

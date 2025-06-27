class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;;
        int n = matrix[0].length;
        int[][] answer = new int[m][n];

        int colMax[] = new int[n];
        for(int j = 0 ; j < n ; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < m ; i++){
                max = Math.max(max, matrix[i][j]);
            }
            colMax[j] = max;
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == -1){
                    answer[i][j] = colMax[j];
                }
                else{
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        return answer;
    }
}

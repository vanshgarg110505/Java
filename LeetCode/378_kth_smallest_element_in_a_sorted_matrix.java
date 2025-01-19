class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ans = new int[row * col];
        int index = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                ans[index++] = matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k - 1];
    }
}

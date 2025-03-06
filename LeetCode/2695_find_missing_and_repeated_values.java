class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] newArr = new int[row * col];
        int n = newArr.length;

        int index = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                newArr[index++] = grid[i][j];
            }
        }

        Arrays.sort(newArr);

        int duplicate = 0;

        int[] ans = new int[2];
        for(int i = 0; i < n - 1; i++){
            if(newArr[i] == newArr[i+1]){
                duplicate = newArr[i];
                break;
            }
        }
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i = 0 ; i < n ; i++){
            actualSum += newArr[i];
        }

        int missing = expectedSum - (actualSum - duplicate);
        ans[0] = duplicate;
        ans[1] = missing;
        return ans;
    }
}

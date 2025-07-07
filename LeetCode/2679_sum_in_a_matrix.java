class Solution {
    public int matrixSum(int[][] nums) {
        int sum = 0;
        int m = nums.length;
        int n = nums[0].length;

        for(int i = 0 ; i < m ; i++){
            Arrays.sort(nums[i]);
        }

        for(int col = n - 1; col >= 0; col--){
            int max = 0;
            for(int row = 0 ; row < m; row++){
                max = Math.max(max, nums[row][col]);
            }
            sum += max;
        }
        return sum;
    }
}

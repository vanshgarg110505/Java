class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i - 1]){
                currentSum += nums[i];
            }
            else{
                maxSum = Math.max(currentSum, maxSum);
                currentSum = nums[i];
            }
        }
        return Math.max(currentSum, maxSum);
    }
}

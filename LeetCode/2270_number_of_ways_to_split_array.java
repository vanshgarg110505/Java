class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0;
        long totalSum = 0;
        int count = 0;
        for(int num : nums){
            totalSum+=num;
        }
        for(int i = 0 ; i < nums.length - 1; i++){
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            if(leftSum >= rightSum){
                count++;
            }
        }
        return count;
    }
}

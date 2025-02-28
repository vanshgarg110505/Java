class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i <= nums.length - k ; i++){
            minDiff = Math.min(minDiff, nums[i+k-1] - nums[i]);
        }
        return minDiff;
    }
}

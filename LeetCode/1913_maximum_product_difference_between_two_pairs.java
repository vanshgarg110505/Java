class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int num1 = nums[0] * nums[1];
        int num2 = nums[n - 1] * nums[n - 2];
        return num2 - num1;
    }
}

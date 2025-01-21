class Solution {
    public int maximumGap(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int n = nums.length;
        if(n < 2){
            return 0;
        }
        for(int i = 0 ; i < n - 1; i++){
            int sum = nums[i+1] - nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}

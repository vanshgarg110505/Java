class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = 0, right = -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            max = Math.max(max, nums[i]);
            if(max > nums[i]){
                right = i;
            }
        }

        for(int i = n - 1 ; i >= 0 ; i--){
            min = Math.min(min, nums[i]);
            if(min < nums[i]){
                left = i;
            }
        }

        return right - left + 1;
    }
}

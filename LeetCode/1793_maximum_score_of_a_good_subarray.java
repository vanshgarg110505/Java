class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int left = k, right = k;
        int minVal = nums[k];
        int maxScore = minVal;

        while(left > 0 || right < n - 1){
            if(left == 0){
                right++;
            }
            else if(right == n - 1){
                left--;
            }
            else if(nums[left - 1] > nums[right + 1]){
                left--;
            }
            else{
                right++;
            }

            minVal = Math.min(minVal, Math.min(nums[left], nums[right]));
            maxScore = Math.max(maxScore, minVal * (right - left + 1));
        }
        return maxScore;
    }
}

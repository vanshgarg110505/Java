class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans = ans + nums[i];
        }
        int total = (n * (n+1))/2;
        return total - ans;
    }
}

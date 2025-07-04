class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i = 0;
        while(i < n){
            count++;
            int max = nums[i];
            int j = i + 1;
            while(j < n && nums[j] < max){
                max = Math.max(max, nums[j]);
                j++;
            }
            i = j;
        }
        return count;
    }
}

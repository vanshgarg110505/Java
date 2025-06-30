class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int subSum = 0, totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            subSum += nums[i];
            result.add(nums[i]);
            if(subSum > totalSum - subSum){
                break;
            }
        }
        return result;
    }
}

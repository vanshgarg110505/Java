class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int start = 0 ; start < nums.length ; start++){
            int product = 1;
            for(int end = start; end < nums.length ; end++){
                product *= nums[end];
                if(product < k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}

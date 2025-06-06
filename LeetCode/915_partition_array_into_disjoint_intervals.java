class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftMax = nums[0];
        int overallMax = nums[0];
        int partition = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] < leftMax){
                partition = i;
                leftMax = overallMax;
            }
            else{
                overallMax = Math.max(overallMax, nums[i]);
            }
        }
        return partition + 1;
    }
}

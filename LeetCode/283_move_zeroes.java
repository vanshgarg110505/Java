class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[nonzero] = nums[i];
                nonzero++;
            }
        }

        while(nonzero < nums.length){
            nums[nonzero] = 0;
            nonzero++;
        }
    }
}

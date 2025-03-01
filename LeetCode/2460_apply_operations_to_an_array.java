class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                if(i != index){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
        return nums;
    }
}

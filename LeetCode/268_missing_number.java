class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        //Search for first missing number
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != index){
                return index;
            }
        }
        //case 2
        return nums.length;

    }
}

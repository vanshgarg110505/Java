class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;

        for(int num : nums){
            if(num % 2 == 0){
                result[evenIndex++] = num;
            }
            else{
                result[oddIndex--] = num;
            }
        }
        return result;
    }
}

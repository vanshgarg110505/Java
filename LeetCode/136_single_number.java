class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num; // XOR each number, duplicates will cancel each other
        }
        return result;
    }
}

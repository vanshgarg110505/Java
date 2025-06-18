class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        long smallestMissing = 1;
        int index = 0;
        while(smallestMissing <= n){
            if(index < nums.length && nums[index] <= smallestMissing){
                smallestMissing += nums[index];
                index++;
            }
            else{
                smallestMissing += smallestMissing;
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double avg[] = new double[n / 2];
        Arrays.sort(nums);

        for(int i = 0 ; i < n / 2 ; i++){
            int min = nums[i];
            int max = nums[n-i-1];
            avg[i] = (min + max) / 2.0;
        }
        Arrays.sort(avg);
        return avg[0];
    }
}

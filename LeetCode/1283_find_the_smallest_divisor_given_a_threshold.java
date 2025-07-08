class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);

        while(low < high){
            int mid = low + (high - low) / 2;
            int total = computeSum(nums, mid);
            if(total <= threshold){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int getMax(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }

    public int computeSum(int nums[], int divisor){
        int sum = 0;
        for(int n : nums){
            sum += (int)Math.ceil((double)n / divisor);
        }
        return sum;
    }
}

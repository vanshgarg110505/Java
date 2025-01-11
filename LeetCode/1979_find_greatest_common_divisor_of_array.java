class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length - 1];
        return gcd(a,b);
    }

    public int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd((b%a), a);
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int product = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int ans = (nums[i] - 1) * (nums[j] - 1);
                product = Math.max(product, ans);
            }
        }
        return product;
    }
}

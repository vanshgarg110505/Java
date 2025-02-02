class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            if(i % 2 == 0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        int[] result = new int[nums.length];
        int evenIndex = 0, oddIndex = 0;
        for(int i = 0 ; i < result.length ; i++){
            if(i % 2 == 0){
                result[i] = even.get(evenIndex++);
            }
            else{
                result[i] = odd.get(oddIndex++);
            }
        }
        return result;
    }
}

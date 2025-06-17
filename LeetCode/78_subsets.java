class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList<>(path));
        for(int i = start ; i < nums.length ; i++){
            path.add(nums[i]);
            backtrack(i + 1 , nums, path, result);
            path.remove(path.size() - 1);
        }
    }
}

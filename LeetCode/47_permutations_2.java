class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> result){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(used[i]){
                continue;
            }

            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, used, path, result);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}

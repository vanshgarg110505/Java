class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int[] candidates, int target, List<Integer> path, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = start ; i < candidates.length ; i++){
            path.add(candidates[i]);
            backtrack(i, candidates, target - candidates[i], path, result);
            path.remove(path.size() - 1);
        }
    }
}

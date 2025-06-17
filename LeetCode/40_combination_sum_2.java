class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int[] candidates, int target, List<Integer> path, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = start ; i < candidates.length ; i++){
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }

            if(candidates[i] > target){
                break;
            }

            path.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], path, result);
            path.remove(path.size() - 1);
        }
    }
}

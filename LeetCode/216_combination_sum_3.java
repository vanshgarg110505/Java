class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> result){
        if(path.size() == k && target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = start ; i <= 9 ; i++){
            if(i > target){
                break;
            }

            path.add(i);
            backtrack(i + 1, k , target - i, path, result);
            path.remove(path.size() - 1);
        }
    }
}

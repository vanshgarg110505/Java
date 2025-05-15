class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, result);
        return result;
    }

    public void dfs(TreeNode node, int remainingSum, List<Integer> path, List<List<Integer>> result){
        if(node == null){
            return;
        }

        path.add(node.val);

        if(node.left == null && node.right == null && node.val == remainingSum){
            result.add(new ArrayList<>(path));
        }
        else{
            dfs(node.left, remainingSum - node.val, path, result);
            dfs(node.right, remainingSum - node.val, path, result);
        }

        path.remove(path.size() - 1);
    }
}

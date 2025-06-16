class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);        
    }

    public int dfs(TreeNode node, int currentValue){
        if(node == null){
            return 0;
        }

        currentValue = (currentValue << 1) | node.val;

        if(node.left == null && node.right == null){
            return currentValue;
        }
        return dfs(node.left, currentValue) + dfs(node.right, currentValue);
    }
}

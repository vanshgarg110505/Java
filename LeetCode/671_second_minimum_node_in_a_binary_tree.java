class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int minVal){
        if(node == null){
            return -1;
        }

        if(node.val > minVal){
            return node.val;
        }

        int left = dfs(node.left, minVal);
        int right = dfs(node.right, minVal);

        if(left == -1) return right;
        if(right == -1) return left;

        return Math.min(left, right);
    }
}

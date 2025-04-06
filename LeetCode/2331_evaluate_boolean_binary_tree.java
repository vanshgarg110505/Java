class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            return root.val == 1;
        }

        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);

        if(root.val == 2){
            return leftVal || rightVal;
        }
        else{
            return leftVal && rightVal;
        }
    }
}

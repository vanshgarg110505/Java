class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        return isUniVal(root, root.val);
    }

    private boolean isUniVal(TreeNode root, int val){
        if(root == null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        return isUniVal(root.left, val) && isUniVal(root.right, val);
    }
}

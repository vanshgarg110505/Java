class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = checkHeight(node.left);
        if(leftHeight == -1){
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;  
        } 
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

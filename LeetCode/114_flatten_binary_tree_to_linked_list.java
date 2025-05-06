class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }        

        flatten(root.left);
        flatten(root.right);

        if(root.left != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode current = root.right;
            while(current.right != null){
                current = current.right;
            }
            current.right = temp;
        }
    }
}

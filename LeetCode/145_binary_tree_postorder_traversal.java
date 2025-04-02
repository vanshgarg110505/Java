class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode node, List<Integer> result){
        if(node == null){
            return;
        }
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.val);
    }
}

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sorted = new ArrayList<>();
        inorder(root, sorted);
        return buildBST(sorted, 0, sorted.size() - 1);
    }

    public void inorder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public TreeNode buildBST(List<Integer> list, int start, int end){
        if(start > end){
            return null;
        }   

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildBST(list, start, mid - 1);
        node.right = buildBST(list, mid + 1, end);

        return node;
    }
}

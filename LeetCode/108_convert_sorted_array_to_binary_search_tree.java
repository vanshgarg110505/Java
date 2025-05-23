class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0 , nums.length - 1);
    }

    private TreeNode constructBST(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = constructBST(nums, left, mid - 1);
        node.right = constructBST(nums, mid + 1, right);

        return node;
    }
}

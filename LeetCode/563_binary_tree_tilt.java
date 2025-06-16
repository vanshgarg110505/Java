class Solution {
    int total = 0;
    public int findTilt(TreeNode root) {
        computeTilt(root);
        return total;
    }

    public int computeTilt(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = computeTilt(node.left);
        int right = computeTilt(node.right);

        int tilt = Math.abs(left - right);
        total += tilt;

        return left + right + node.val;
    }
}

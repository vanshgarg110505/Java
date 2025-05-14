class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = queue.poll();
                maxVal = Math.max(maxVal, curr.val);

                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(maxVal);
        }
        return result;
    }
}

class Solution {
    public int maxDepth(Node root) {
        int max = 0;
        if(root == null){
            return 0;
        }
        for(Node child : root.children){
            max = Math.max(max, maxDepth(child));
        }
        return max + 1;
    }
}

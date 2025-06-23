class Solution {
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int heights[] = new int[cols];
        int maxArea = 0;
        for(char[] rows : matrix){
            for(int j = 0 ; j < cols; j++){
                if(rows[j] == '1'){
                    heights[j]++;
                }
                else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, getHistogramArea(heights));
        }
        return maxArea;
    }

    public int getHistogramArea(int[] heights){
        int max = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i <= n ; i++){
            int h = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1; 
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }
}

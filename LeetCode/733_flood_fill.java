class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originColor = image[sr][sc];

        if(originColor == color){
            return image;
        }
        dfs(image, sr, sc, originColor, color);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int originColor, int newColor){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length){
            return;
        }

        if(image[r][c] != originColor){
            return;
        }

        image[r][c] = newColor;
        
        dfs(image, r + 1, c , originColor, newColor);
        dfs(image, r - 1, c , originColor, newColor);
        dfs(image, r, c + 1 , originColor, newColor);
        dfs(image, r, c - 1 , originColor, newColor);
    }
}

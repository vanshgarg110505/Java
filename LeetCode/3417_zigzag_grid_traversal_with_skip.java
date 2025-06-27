class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean safeVisit = true;
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < n ; j++){
                    if(safeVisit){
                        result.add(grid[i][j]);
                    }
                    safeVisit = !safeVisit;
                }
            }
            else{
                for(int j = n - 1 ; j >= 0 ; j--){
                    if(safeVisit){
                        result.add(grid[i][j]);
                    }
                    safeVisit = !safeVisit;
                }
            }
        }
        return result;
    }
}

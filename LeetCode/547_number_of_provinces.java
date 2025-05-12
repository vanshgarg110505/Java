class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        int provinces = 0;

        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int city, int[][] isConnected, boolean visited[]){
        visited[city] = true;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(!visited[i]){
                if(isConnected[city][i] == 1){
                    dfs(i, isConnected, visited);
                }
            }
        }
    }
}

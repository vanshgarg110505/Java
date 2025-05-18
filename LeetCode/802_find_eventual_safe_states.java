class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> safeNodes = new ArrayList<>();
        int color[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            if(dfs(graph, i , color)){
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    public boolean dfs(int[][] graph, int i, int[] color){
        if(color[i] == 1){
            return false;
        }

        if(color[i] == 2){
            return true;
        }

        color[i] = 1;
        for(int neighbor : graph[i]){
            if(!dfs(graph, neighbor, color)){
                return false;
            }
        }
        color[i] = 2;
        return true;
    }
}

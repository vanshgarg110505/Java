class Solution {
  public static int[] shortestPath(int n, int m, int[][] edges, int src){
    List<List<Integer>> adj = new ArrayList<>();
    for(int i = 0 ; i < n ; i++){
      adj.add(new ArrayList<>());
    }
    
    for(int[] edge : edges){
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }
    
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[src] = 0;
    
    Queue<Integer> queue = new LinkedList<>();
    queue.add(src);
    
    while(!queue.isEmpty()){
      int node = queue.poll();
      for(int neighbor : adj.get(node)){
        if(dist[node] + 1 <dist[neighbor]){
          dist[neighbor] = dist[node] + 1;
          queue.add(neighbor);
        }
      }
    }
    
    for(int i = 0 ; i < n ; i++){
      if(dist[i] == Integer.MAX_VALUE){
        dist[i] = -1;
      }
    }
    return dist;
  }
}

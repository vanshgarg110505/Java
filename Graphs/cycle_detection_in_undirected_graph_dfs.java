import java.util.*;

public class Main {
  public static boolean hasCycle(int v, List<List<Integer>> adj){
    boolean[] visited = new boolean[v];
    for(int i = 0 ; i < v ; i++){
      if(!visited[i]){
        if(dfs(i, -1, visited, adj)){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj){
    visited[node] = true;
    for(int neighbor : adj.get(node)){
      if(!visited[neighbor]){
        if(dfs(neighbor, node, visited, adj)){
          return true;
        }
      }
      else if(neighbor != parent){
        return true;
      }
    }
    return false;
  }
  
  public static void addEdge(List<List<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u); // undirected graph
  }
  
  public static void main(String[] args) {
    int V = 5; // number of vertices
    List<List<Integer>> adj = new ArrayList<>();

    // initialize adjacency list
    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<>());
    }

    // create undirected edges
    addEdge(adj, 0, 1);
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 4, 1); // This creates a cycle

    boolean[] visited = new boolean[V];
    boolean hasCycle = false;

    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        if (dfs(i, -1, visited, adj)) {
          hasCycle = true;
          break;
        }
      }
    }

    System.out.println("Cycle detected: " + hasCycle);
  }
}

import java.util.*;

public class Graph {
  public boolean hasCycle(int n, List<List<Integer>> adj){
    boolean visited[] = new boolean[n];
    boolean recStack[] = new boolean[n];
    
    for(int i = 0 ; i < n ; i++){
      if(!visited[i]){
        if(dfs(i, adj, visited, recStack)){
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean dfs(int i, List<List<Integer>> adj, boolean visited[], boolean recStack[]){
    visited[i] = true;
    recStack[i] = true;
    
    for(int neighbor : adj.get(i)){
      if(!visited[neighbor]){
        if(dfs(neighbor, adj, visited, recStack)){
          return true;
        }
      }
      else if(recStack[neighbor]){
        return true;
      }
    }
    
    recStack[i] = false;
    return false;
  }
}

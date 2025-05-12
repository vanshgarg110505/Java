import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    
    List<List<Integer>> adjList = new ArrayList<>();
    for(int i = 0 ; i <= n ; i++){
      adjList.add(new ArrayList<>());
    }
    
    for(int i = 0 ; i < m ; i++){
      int u = in.nextInt();
      int v = in.nextInt();
      
      adjList.get(u).add(v);
      adjList.get(v).add(u);
    }
    
    boolean visited[] = new boolean[n + 1];
    
    for(int i = 1 ; i <= n ; i++){
      if(!visited[i]){
        dfs(i, adjList, visited);
      }
    }
  }
  
  public static void dfs(int start, List<List<Integer>> adjList, boolean visited[]){
    visited[start] = true;
    System.out.print(start + " ");
    
    for(int neighbor : adjList.get(start)){
      if(!visited[neighbor]){
        dfs(neighbor, adjList, visited);
      }
    }
  }
}

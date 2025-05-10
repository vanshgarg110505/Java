import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); // number of nodes 
    int m = in.nextInt(); // number of edges
    
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
        bfs(i, adjList, visited);
      }
    }
  }
  public static void bfs(int start, List<List<Integer>> adjList, boolean visited[]){
    Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);
    
    while(!queue.isEmpty()){
      int node = queue.poll();
      System.out.print(node + " ");
      for(int neighbor : adjList.get(node)){
        if(!visited[neighbor]){
          visited[neighbor] = true;
          queue.add(neighbor);
        }
      }
    }
  }
}

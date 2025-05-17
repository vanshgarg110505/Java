import java.util.*;

public class Main {
  public static int[] topologicalSort(int n, List<List<Integer>> adj){
    boolean visited[] = new boolean[n];
    Stack<Integer> stack = new Stack<>();
    
    for(int i = 0 ; i < n ; i++){
      if(!visited[i]){
        dfs(i, adj, visited, stack);
      }
    }
    
    int result[] = new int[n];
    int i = 0;
    while(!stack.isEmpty()){
      result[i++] = stack.pop();
    }
    return result;
  }
  
  public static void dfs(int i, List<List<Integer>> adj, boolean visited[], Stack<Integer> stack){
    visited[i] = true;
    for(int neighbor : adj.get(i)){
      if(!visited[neighbor]){
        dfs(neighbor, adj, visited, stack);
      }
    }
    stack.push(i);
  }
  
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    
    List<List<Integer>> adj = new ArrayList<>();
    for(int i = 0 ; i < n ; i++){
      adj.add(new ArrayList<>());
    }
    
    for(int i = 0 ; i < m ; i++){
      int u = in.nextInt();
      int v = in.nextInt();
      
      adj.get(u).add(v);
    }
    
    int result[] = topologicalSort(n, adj);
    for(int num : result){
      System.out.print(num + " ");
    }
  }
}

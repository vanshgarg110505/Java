import java.util.*;

public class Main {
  public static List<Integer> topologicalSort(int n, List<List<Integer>> adj){
    int indegree[] = new int[n];
    for(int i = 0 ; i < n ; i++){
      for(int v : adj.get(i)){
        indegree[v]++;
      }
    }
    
    Queue<Integer> queue = new LinkedList<>();
    for(int i = 0 ; i < n ; i++){
      if(indegree[i] == 0){
        queue.add(i);
      }
    }
    
    List<Integer> topoOrder = new ArrayList<>();
    while(!queue.isEmpty()){
      int i = queue.poll();
      topoOrder.add(i);
      for(int neighbor : adj.get(i)){
        indegree[neighbor]--;
        if(indegree[neighbor] == 0){
          queue.add(neighbor);
        }
      }
    }
    
    if(topoOrder.size() != n){
      return new ArrayList<>();
    }
    return topoOrder;
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
    
    List<Integer> result = topologicalSort(n, adj);
    for(int num : result){
      System.out.print(num + " ");
    }
  }
}

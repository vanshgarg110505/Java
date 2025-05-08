import java.util.*;

public class Graph {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    for(int i = 0 ; i <= n ; i++){
      adjList.add(new ArrayList<>());
    }
    
    for(int i = 0 ; i < m ; i++){
      int u = in.nextInt();
      int v = in.nextInt();
      
      adjList.get(u).add(v);
      adjList.get(v).add(u);
    }
    
    for(int i = 1 ; i <= n ; i++){
      System.out.print(i + " -> ");
      for(int num : adjList.get(i)){
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}

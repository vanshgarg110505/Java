import java.util.*;

public class Graph {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      
      int adjMatrix[][] = new int[n + 1][n + 1];
      
      for(int i = 0 ; i < m ; i++){
        int u = in.nextInt();
        int v = in.nextInt();
        
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
      }
      
      for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= n ; j++){
          System.out.print(adjMatrix[i][j] + " ");
        }
        System.out.println();
      }
    }
}

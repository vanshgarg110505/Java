import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[][] maze = {
          {true, true, true},
          {true, true, true},
          {true, true, true}
        };
        path("",maze, 0,0);
    }
  
    static void path(String p, boolean[][]maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1){
          System.out.println(p);
          return;
        }
        if(maze[r][c] == false){
          return;
        }
        maze[r][c] = false; // i am considering this block in my path
        if(r< maze.length - 1){
          path(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length - 1){
          path(p+'R', maze,  r, c+1);
        }
        if(r>0){
          path(p+'U', maze, r-1, c);
        }
        if(c>0){
          path(p+'L', maze, r, c-1);
        }
        
        // this line is where function will be over
        // before the function gets removed, remove the changes made by that function
        maze[r][c] = true;
    }
}

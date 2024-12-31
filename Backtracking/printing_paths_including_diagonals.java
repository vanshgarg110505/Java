import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println(path("",3,3));        
    }
  
    static ArrayList<String> path(String p, int r, int c) {
        if(r == 1 && c == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
          list.addAll(path(p+'V', r-1, c));
        }
        if(c>1){
          list.addAll(path(p+'H', r, c-1));
        }
        if(r>1 && c>1){
          list.addAll(path(p+'D', r-1, c-1));
        }
        return list;
    }
}

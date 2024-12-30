import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str = "baccapplead";
      String skip = "apple";
      String result = skipString(str, skip);
      System.out.print(result);
    }
    
    static String skipString(String str, String skip){
      return str.replace(skip, "");
    }
}

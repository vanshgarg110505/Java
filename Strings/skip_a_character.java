import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str = "baccad";
      char skip = 'a';
      String result = skipChar(str, skip);
      System.out.print(result);
    }
    
    static String skipChar(String str, char skip){
      StringBuilder result = new StringBuilder();
      for(int i = 0 ; i < str.length() ; i++){
        if(str.charAt(i) != skip){
          result.append(str.charAt(i));
        }
      }
      return result.toString();
    }
}

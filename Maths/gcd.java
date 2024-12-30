import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a = 4;
      int b = 18;
      System.out.print(gcd(a,b));
    }
    static int gcd(int a, int b){
      if(a == 0){
        return b;
      }
      return gcd((b%a), a);
    }
}

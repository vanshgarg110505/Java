import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num = 12345;
      int ans = sum(num);
      System.out.print(ans);
    }
    static int sum(int n){
      if(n==0){
        return 0;
      }
      return (n%10) + sum(n/10);
    }
} 

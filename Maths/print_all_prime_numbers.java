import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 40;
      for(int i = 1 ; i <= n ; i++){
        if(isPrime(i)){
          System.out.println(i);
        }
      }
    }
    
    static boolean isPrime(int n){
      if(n<=1){
        return false;
      }
      for(int i = 2 ; i * i <= n ; i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
}

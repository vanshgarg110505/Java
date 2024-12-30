import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 3020004;
      System.out.print(check(n));
    }
    static int check(int n){
      int count = 0;
      
      while(n>0){
        int rem = n % 10;
        n = n / 10;
        if(rem == 0){
          count++;
        }
      }
      return count;
    }
} 

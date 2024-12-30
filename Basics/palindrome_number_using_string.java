import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 12321;
      System.out.print(isPalindrome(n));
    }
    static int reverse(int n){
      int ans = 0;
      while(n>0){
        int rem = n%10;
        n = n / 10;
        ans = ans*10+rem;
      }
      return ans;
    }
    static boolean isPalindrome(int n){
      return n == reverse(n);
    }
} 

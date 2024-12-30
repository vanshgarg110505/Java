import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 12321;
      System.out.print(isPalindrome(n));
    }
    static boolean isPalindrome(int n){
      String str = Integer.toString(n);
      int start = 0;
      int end = str.length() - 1;
      while(start < end){
        if(str.charAt(start) != str.charAt(end)){
          return false;
        }
        start++;
        end--;
      }
      return true;
    }
} 

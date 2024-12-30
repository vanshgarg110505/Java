public class Main {
    public static void main(String[] args) {
        int n = 1234321;
        if(reverse(n)){
          System.out.print(n + " is a palindrome");
        }
        else{
          System.out.print(n + " is not a palindrome");
        }
    }

    static boolean reverse(int n){
      int original = n;
      int ans = 0;
      while(n>0){
        int rem = n % 10;
        n = n / 10;
        ans = ans * 10 + rem;
      } 
      if(original == ans){
        return true;
      }
      return false;
    }
}

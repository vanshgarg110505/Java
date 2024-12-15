import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int fib = 0;
        if(n >= 1){
            System.out.print(a);
        }
        if(n >= 2){
            System.out.print(" " + b);
        }
        for(int i = 3 ; i <= n ; i++){
            fib = a + b;
            System.out.print(" " + fib);
            a = b;
            b = fib;
        }
        
    }
}

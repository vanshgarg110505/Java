import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int fib = 0;
        if(n<=1){
            System.out.print(n);
        }
        for(int i = 2 ; i <= n ; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        System.out.print(fib);
    }
}

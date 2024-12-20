import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a + " " + b);
    }
}

/*
  Input :- 2 5
  Output :- 5 2
*/

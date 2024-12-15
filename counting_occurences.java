import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int element = in.nextInt();
        while(n>0){
            int rem = n%10;
            if(rem == element){
                count++;
            }
            n = n/10;
        }
        System.out.print(count);
    }
}

import java.util.Scanner;

class Main {
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isArmstrong(n)){
            System.out.print(n + " is an armstrong number");
        }l
        else{
            System.out.print(n + " is not an armstrong number");
        }
    }
}

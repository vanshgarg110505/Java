import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
    }
}


/*
    Input :- Vansh
    Ouput :- Uppercase
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        int a = 6;
        if (a % 4 == 0){
            System.out.print(a);    
        }
        else if(a % 4 == 1){
            System.out.print(1);
        }
        else if(a % 4 == 2){
            System.out.print(a + 1);
        }
        else if(a % 4 == 3){
            System.out.print(0);
        }
    }
}

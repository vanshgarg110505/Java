import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 8;
        if((n & (n-1)) == 0){
            System.out.print("It is a power of 2");
        }
        else{
            System.out.print("It is not a power of 2");
        }
    }
}

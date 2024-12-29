import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.print(ans);
    }
}

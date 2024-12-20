class Main {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for(int space = 1 ; space <= i - 1 ; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}


/*

***
 **
  *

*/

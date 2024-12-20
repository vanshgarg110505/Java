class Main {
    public static void main(String[] args) {
        int n = 3; 
        int space = 2 * n - 2;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= space ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
            space = space - 2;
        }
        space = n - 1;
        for(int i = n - 1 ; i>=1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= space ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
            space = space + 2;
        }
    }
}

/*

*    *
**  **
******
**  **
*    *

*/

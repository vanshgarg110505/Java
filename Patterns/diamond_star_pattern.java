class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1 ; i <= n ; i++){
            for(int space = 1 ; space <= n - i ; space++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1 ; i >= 1 ; i--){
            for(int space = n-i ; space >= 1 ; space--){
                System.out.print(" ");
            }
            for(int j = 2 * i - 1 ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
    *
   ***
  *****
   ***
    *
*/

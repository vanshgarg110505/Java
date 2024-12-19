class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i <= n ; i++){
            for(int space = 1 ; space <= n - i ; space++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print((char)('A' + j - 1));
            }
            for(int j = i - 1 ; j >= 1 ; j--){
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }
}

/*

  A
 ABC
ABCBA

*/

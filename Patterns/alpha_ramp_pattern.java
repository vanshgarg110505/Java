class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print((char)('A' + i - 1) + " ");
            }
            System.out.println();
        }
    }
}

/*

A
B B
C C C

*/

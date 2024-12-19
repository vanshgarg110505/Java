class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)('A' + n + j - i - 1) + " ");
            }
            System.out.println();
        }
    }
}

/*
C
B C
A B C
*/

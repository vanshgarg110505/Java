class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i= n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(j);
            }
            for(int space = 1 ; space <= 2*(n-i) ; space++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*

123321
12  21
1    1

*/

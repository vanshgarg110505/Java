class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i= 1 ; i <= n ; i++){
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
    
    1    1
    12  21
    123321
*/

class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = n; i >= 1 ; i--){
            for(int j = i ; j >= 1; j--){
                System.out.print((char)('A'- j + i) + " ");
            }
            System.out.println();
        }
    }
}

/*
A B C 
A B 
A
*/

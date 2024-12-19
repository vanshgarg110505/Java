class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int i = n; i >= 1; i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
    4 4 4 4 
    3 3 3 
    2 2 
    1 
*/

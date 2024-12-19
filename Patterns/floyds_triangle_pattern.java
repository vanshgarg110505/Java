class Main {
    public static void main(String[] args) {
        int n = 3;
        int start = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}

/*

1
23
456

*/

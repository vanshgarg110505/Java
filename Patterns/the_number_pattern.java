class Main {
    public static void main(String[] args) {
        int N = 3;
        int size = 2 * N - 1; 

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int value = N - Math.min(Math.min(i - 1, j - 1), Math.min(size - i, size - j)); 
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
    }
}


/*

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 

*/

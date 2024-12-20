class Main {
    public static void main(String[] args) {
        int n = 4; 
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(num);
                } else {
                    System.out.print(num + "*");
                }
                num++; 
            }
            System.out.println();
        }
    }
}


/*

1
2*3
4*5*6
7*8*9*10

*/

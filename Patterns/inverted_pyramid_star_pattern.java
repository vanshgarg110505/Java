class Main {
    public static void main(String[] args) {
        int n = 3;
        for(int i = n ; i >= 1 ; i--){
            for(int space = n-i ; space >= 1 ; space--){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
  * * * 
   * * 
    * 
*/

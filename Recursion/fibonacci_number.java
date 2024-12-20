class Main {
    public static void main(String[] args) {
        System.out.print(fib(7));
    }
    static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

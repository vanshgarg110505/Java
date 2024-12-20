class Main {
    public static void main(String[] args) {
        String str = "abcdcba";
        str = str.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}

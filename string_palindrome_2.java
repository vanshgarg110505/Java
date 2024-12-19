class Main {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
    
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

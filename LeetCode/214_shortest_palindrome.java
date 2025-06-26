class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + '#' + rev;

        int lps[] = new int[combined.length()];
        for(int i = 1 ; i < combined.length(); i++){
            int len = lps[i-1];
            while(len > 0 && combined.charAt(i) != combined.charAt(len)){
                len = lps[len-1];
            }

            if(combined.charAt(i) == combined.charAt(len)){
                len++;
            }
            lps[i] = len;
        }

        int palindrome = lps[combined.length() - 1];
        String suffix = s.substring(palindrome);
        String prefix = new StringBuilder(suffix).reverse().toString();
        return prefix + s;
    }
}

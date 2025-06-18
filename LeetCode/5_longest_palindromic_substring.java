class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }

        int start = 0;
        int end = 0;

        for(int center = 0 ; center < s.length() ; center++){
            int len1 = expand(s, center, center);
            int len2 = expand(s, center, center + 1);

            int len = Math.max(len1, len2);

            if(len > end - start){
                start = center - (len - 1) / 2;
                end = center + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}

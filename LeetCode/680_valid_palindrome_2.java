class Solution {
    public boolean validPalindrome(String s) {
        return isPalindromeAfterDelete(s, 0 , s.length() - 1 , true);
    }

    public boolean isPalindromeAfterDelete(String s, int left, int right, boolean canDelete){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                if(!canDelete){
                    return false;
                }
                return isPalindromeAfterDelete(s, left + 1, right, false) || isPalindromeAfterDelete(s, left, right-1, false);
            }
        }
        return true;
    }
}

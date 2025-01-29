class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doub = s + s;
        return doub.substring(1, doub.length() - 1).contains(s);
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
        int ans = sb.indexOf(needle);
        return ans;
    }
}

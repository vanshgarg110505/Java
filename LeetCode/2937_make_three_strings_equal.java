class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int commonPrefixLength = 0;
        while(commonPrefixLength < minLen && s1.charAt(commonPrefixLength) == s2.charAt(commonPrefixLength) && s2.charAt(commonPrefixLength) == s3.charAt(commonPrefixLength)){
            commonPrefixLength++;
        }

        if(commonPrefixLength == 0){
            return -1;
        }

        int ops = (s1.length() - commonPrefixLength) + (s2.length() - commonPrefixLength) + (s3.length() - commonPrefixLength);
        return ops;
    }
}

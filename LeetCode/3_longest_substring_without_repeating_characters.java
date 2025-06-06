class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;

        Set<Character> set = new HashSet<>();
        while(start < n && end < n){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}

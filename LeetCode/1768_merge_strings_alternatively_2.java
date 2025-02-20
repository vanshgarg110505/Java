class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int length = Math.max(word1.length(), word2.length());
        for(int i = 0 ; i < length ; i++){
            if(i < word1.length()){
                result += word1.charAt(i);
            }
            if(i < word2.length()){
                result += word2.charAt(i);
            }
        }
        return result;
    }
}

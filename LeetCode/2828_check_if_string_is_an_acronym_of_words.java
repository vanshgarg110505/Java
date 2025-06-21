class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word.charAt(0));
        }

        String ans = sb.toString();
        if(ans.equals(s)){
            return true;
        }
        return false;
    }
}

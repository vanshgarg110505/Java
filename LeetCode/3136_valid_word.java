class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonent = false;
        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }

            if(Character.isLetter(c)){
                char lower = Character.toLowerCase(c);
                if("aeiou".indexOf(lower) >= 0){
                    hasVowel = true;
                }
                else{
                    hasConsonent = true;
                }
            }
        }
        return hasVowel && hasConsonent;
    }
}

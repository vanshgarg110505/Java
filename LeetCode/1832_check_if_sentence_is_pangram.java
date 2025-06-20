class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(char c : alphabets.toCharArray()){
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while(word.length() < k){
            StringBuilder newStr = new StringBuilder();
            for(char c : word.toString().toCharArray()){
                newStr.append(nextChar(c));
            }
            word.append(newStr);
        }
        return word.charAt(k - 1);
    }

    public char nextChar(char c){
        return c == 'z' ? 'a' : (char)(c+1);
    }
}

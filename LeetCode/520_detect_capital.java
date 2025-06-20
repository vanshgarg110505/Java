class Solution {
    public boolean detectCapitalUse(String word) {
        String lower = word.toLowerCase();
        String upper = word.toUpperCase();
        String first = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();

        if(word.equals(lower) || word.equals(upper) || word.equals(first)){
            return true;
        }
        return false;
    }
}

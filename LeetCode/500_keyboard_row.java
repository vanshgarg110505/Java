class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        Set<Character> set1 = toSet(row1);
        Set<Character> set2 = toSet(row2);
        Set<Character> set3 = toSet(row3);

        List<String> result = new ArrayList<>();
        for(String word : words){
            String lower = word.toLowerCase();
            if(sameRow(lower, set1) || sameRow(lower, set2) || sameRow(lower, set3)){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    public Set<Character> toSet(String chars){
        Set<Character> set = new HashSet<>();
        for(char c : chars.toCharArray()){
            set.add(c);
        }
        return set;
    }

    public boolean sameRow(String word, Set<Character> row){
        for(char c : word.toCharArray()){
            if(!row.contains(c)){
                return false;
            }
        }
        return true;
    }
}

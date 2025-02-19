class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");
        
        Arrays.sort(words, Comparator.comparingInt(String :: length));
        words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1);

        return String.join(" ", words);
    }
}

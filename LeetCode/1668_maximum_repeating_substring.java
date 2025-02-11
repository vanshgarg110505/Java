class Solution {
    public int maxRepeating(String sequence, String word) {
        String repeat = word;
        int k = 0;
        while(sequence.contains(repeat)){
            repeat += word;
            k++;
        }
        return k;
    }
}

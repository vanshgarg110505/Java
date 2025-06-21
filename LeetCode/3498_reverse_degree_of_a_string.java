class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            int index = i + 1;
            int reverse = 26 - (s.charAt(i) - 'a');
            count += index * reverse;
        }
        return count;
    }
}

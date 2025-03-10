class Solution {
    public boolean hasMatch(String s, String p) {
        int starIndex = p.indexOf('*');

        String prefix = p.substring(0, starIndex);
        String suffix = p.substring(starIndex + 1);

        int startIndex = s.indexOf(prefix);
        if(startIndex == -1){
            return false;
        }

        return s.indexOf(suffix, startIndex + prefix.length()) != -1;
    }
}

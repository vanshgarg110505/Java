class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        int count = 0;
        int first = -1, second = -1;

        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(first == -1){
                    first = i;
                }
                else if(second == -1){
                    second = i;
                }
                else{
                    return false;
                }
            }
        }

        if(count == 2 && s1.charAt(first) == s2.charAt(second) && s2.charAt(first) == s1.charAt(second)){
            return true;
        }
        return false;
    }
}

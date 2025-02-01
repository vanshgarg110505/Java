class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2);

        int count1 = 0;
        int count2 = 0;
        for(char c : s1.toCharArray()){
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
                count1++;
            }
        }

        for(char c : s2.toCharArray()){
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
                count2++;
            }
        }

        if(count1 == count2){
            return true;
        }
        return false;
    }
}

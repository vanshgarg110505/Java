class Solution {
    public int countKeyChanges(String s) {
        int change = 0;
        for(int i = 1 ; i < s.length(); i++){
            char prev = Character.toLowerCase(s.charAt(i - 1));
            char next = Character.toLowerCase(s.charAt(i));

            if(next != prev){
                change++;
            }
        }
        return change;
    }
}

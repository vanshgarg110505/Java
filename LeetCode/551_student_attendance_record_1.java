class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        int consecutiveLates = 0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                A++;
                if(A >= 2){
                    return false;
                }
                consecutiveLates = 0;
            }
            if(c == 'L'){
                consecutiveLates++;
                if(consecutiveLates >= 3){
                    return false;
                }
            }
            else{
                consecutiveLates = 0;
            }
        } 
        return true;
    }
}

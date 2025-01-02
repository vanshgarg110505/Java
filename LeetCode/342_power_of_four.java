class Solution {
    public boolean isPowerOfFour(int n) {
        int x = 100;
        for(int i = 0 ; i < x ; i++){
            if(n == Math.pow(4,i)){
                return true;
            }
        }
        return false;
    }
}

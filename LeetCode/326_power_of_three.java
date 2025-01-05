class Solution {
    public boolean isPowerOfThree(int n) {
        int x = 100;
        for(int i = 0 ; i < x ; i++){
            if(n == Math.pow(3,i)){
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;
        int rev = 0;
        int rev2 = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        while(rev > 0){
            int rem = rev % 10;
            rev2 = rev2 * 10 + rem;
            rev = rev / 10;
        }

        if(original == rev2){
            return true;
        }
        return false;
    }
}

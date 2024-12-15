class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

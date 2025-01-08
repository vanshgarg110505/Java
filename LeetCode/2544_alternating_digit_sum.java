class Solution {
    public int alternateDigitSum(int n) {
        String numStr = String.valueOf(n);
        int sum = 0;
        boolean isPositive = true;
        for(char digitChar : numStr.toCharArray()){
            int digit = digitChar - '0';
            if(isPositive){
                sum += digit;
            }
            else{
                sum -= digit;
            }

            isPositive = !isPositive;
        }
        return sum;
    }
}

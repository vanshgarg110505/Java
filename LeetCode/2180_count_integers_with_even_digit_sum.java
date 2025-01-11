class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
            int digitSum = 0;
            int current = i;

            while(current > 0){
                digitSum += current % 10;
                current /= 10;
            }

            if(digitSum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

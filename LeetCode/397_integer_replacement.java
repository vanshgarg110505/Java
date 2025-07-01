class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int steps = 0;
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                if(num == 3 || (num & 2) == 0){
                    num--;
                }
                else{
                    num++;
                }
            }
            steps++;
        }
        return steps;
    }
}

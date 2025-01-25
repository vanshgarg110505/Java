class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        }
        while(slow != fast);

        return slow == 1;
    }

    public int getSumOfSquares(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}

class Solution {
    public int minSteps(int n) {
        if(n == 1){
            return 0;
        }

        int operations = n;
        for(int i = 2; i * i <= n ; i++){
            if(n % i == 0){
                operations = Math.min(operations, i + minSteps(n / i));
                operations = Math.min(operations, n / i + minSteps(i));
            }
        }
        return operations;
    }
}

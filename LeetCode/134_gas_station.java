class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, currentTank = 0, start = 0;
        for(int i = 0 ; i < gas.length ; i++){
            int diff = gas[i] -cost[i];
            totalTank += diff;
            currentTank += diff;

            if(currentTank < 0){
                start = i + 1;
                currentTank = 0;
            }
        }
        return totalTank >= 0 ? start : -1;
    }
}

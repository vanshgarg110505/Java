class Solution {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for(int m : machines){
            total += m;
        }
        int n = machines.length;
        if(total % n != 0){
            return -1;
        }

        int target = total / n;
        int runningDiff = 0;
        int maxMoves = 0;

        for(int load : machines){
            int diff = load - target;
            runningDiff += diff;
            maxMoves = Math.max(maxMoves, Math.max(Math.abs(runningDiff), diff));
        }
        return maxMoves;
    }
}

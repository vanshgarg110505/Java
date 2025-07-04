class Solution {
    public int findJudge(int n, int[][] trust) {
        int trustCount[] = new int[n+1];
        for(int pair[] : trust){
            int a = pair[0];
            int b = pair[1];

            trustCount[a]--;
            trustCount[b]++;
        }

        for(int i = 1 ; i <= n ; i++){
            if(trustCount[i] == n - 1){
                return i;
            }
        }
        return -1;
    }
}

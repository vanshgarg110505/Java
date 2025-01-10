class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int week = i / 7;
            int dayOfWeek = i % 7;

            sum = sum + (week + 1) + dayOfWeek;
        }
        return sum;
    }
}

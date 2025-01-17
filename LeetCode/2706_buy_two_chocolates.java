class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);    
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[0] + prices[1] <= money){
                return money - prices[0] - prices[1];
            }
        }
        return money;
    }
}

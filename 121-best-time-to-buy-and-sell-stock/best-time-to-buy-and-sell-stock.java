class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for(int i=0 ; i<prices.length; i++){
            if(prices[i]<buy) buy = prices[i];
            else if(profit<prices[i]-buy) profit = prices[i] - buy;
        }

        return profit;
    }
}
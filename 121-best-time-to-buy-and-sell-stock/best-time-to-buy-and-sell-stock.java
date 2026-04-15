class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0],max = 0;
        for(int price:prices){
            if(buy >= price){
                buy = price;
            }else{
                int sell = price - buy;
                max = Math.max(sell, max);
            }
        }
        return max;
    }
}
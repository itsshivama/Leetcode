class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        
        int pSell = 0, pBuy = 0, sell= 0, buy =Integer.MIN_VALUE;
        for(int price: prices) {
            pBuy = buy;
            buy = Math.max(buy, pSell - price);
            pSell = sell;
            sell = Math.max(sell, pBuy + price);
        }
        return sell;
        
        // int[] buy = new int[len+1];
        // int[] sell = new int[len+1];
        // buy[1] = -prices[0];
        // sell[1] = 0;
        // for(int i = 2; i < len+1; i++) {
        //     buy[i] = Math.max(buy[i-1], sell[i-2]-prices[i-1]);
        //     sell[i] = Math.max(sell[i-1], buy[i-1]+prices[i-1]);
        // }
        // return Math.max(buy[len], sell[len]);
    }
}
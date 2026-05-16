class Solution {
    public int maxProfit(int[] prices) {
        // choose single day to buy, choose a different day to sell => max profit ? 
        /*
        This mean finding the maximum different between 2 prices. No possible => return 0
        */
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sellPrice = prices[j];
                res = Math.max(res, sellPrice - buyPrice);
            }
        }
        return res;
    }
}

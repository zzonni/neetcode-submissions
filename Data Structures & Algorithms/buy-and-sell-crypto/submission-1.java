class Solution {
    public int maxProfit(int[] prices) {
        // choose single day to buy, choose a different day to sell => max profit ? 
        /*
        This mean finding the maximum different between 2 prices without sorting. No possible => return 0
        
        */
        int res = 0, l = 0, r = 1;
        while (r < prices.length) {
            int buyPrice = prices[l];
            int sellPrice = prices[r];
            if (sellPrice > buyPrice) {
                res = Math.max(res,sellPrice - buyPrice);
            } else {
                l = r; // sell price <= buy price, shift l to r position
            }
            r++;
        }
        return res;
    }
}

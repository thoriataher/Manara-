class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            buyPrice = Math.min(buyPrice, price);

            int profit = price - buyPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            int cost = prices[i];

            for(int j = i + 1; j < prices.length; j++){

                int sellPrice = prices[j];
                int profit = sellPrice - cost;

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}

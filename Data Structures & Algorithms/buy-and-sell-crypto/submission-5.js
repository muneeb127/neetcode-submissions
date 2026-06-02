class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let left = 0;
        let right = 1;
        let maxProfit = 0;

        while(right <= prices.length - 1){
            let profit = prices[right] - prices[left];
            if(profit > 0){
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}

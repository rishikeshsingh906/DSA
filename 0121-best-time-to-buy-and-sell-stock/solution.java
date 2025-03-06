class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int buyprices= Integer.MAX_VALUE;
        int maxprofit= 0;

        for(int i=0; i< n; i++){
            if(buyprices < prices[i]){
                int profit = prices[i] -buyprices;
                maxprofit =Math.max(profit, maxprofit);
            }else{
                buyprices =prices[i];
            }
        }
        return maxprofit;
        
    }
}

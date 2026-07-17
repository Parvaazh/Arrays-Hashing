class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;int currentProfit=0;
        int right=1;int left=0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                currentProfit=prices[right]-prices[left];
                maxProfit=Math.max(currentProfit,maxProfit);
            }else{
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}
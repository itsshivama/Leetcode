class Solution {
    public int maxProfit(int[] prices) {
        int maxCurr=0;
        int maxSoFar=0;
        for(int i=1;i<prices.length;i++){
            maxCurr+=prices[i]-prices[i-1];
            maxCurr=Math.max(0,maxCurr);
            maxSoFar=Math.max(maxSoFar, maxCurr);
        }
        return maxSoFar;
        
    }
}
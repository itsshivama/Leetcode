class Solution {
    public int maxProfit(int[] prices) {
        int maxCurr=Integer.MAX_VALUE;
        int maxSoFar=0;
        for(int i=0;i<prices.length;i++){
            maxCurr=Math.min(maxCurr, prices[i]);
            maxSoFar=Math.max(maxSoFar, prices[i]-maxCurr);
        }
        return maxSoFar;
        
    }
}
class Solution {

    public int minimizeArrayValue(int[] nums) {
        int result = 0;
        long[] dp = new long[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + dp[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            long ave = dp[i] / (long) (i + 1);
            if (dp[i] % (i + 1) == 0) {
                result = Math.max(result, (int) ave);
            } else {
                result = Math.max(result, (int) ave + 1);
            }
        }
        return result;
    }
}

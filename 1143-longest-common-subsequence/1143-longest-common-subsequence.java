class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] arr1;
        char[] arr2;
        if (text1.length() > text2.length()) {
            arr1 = text1.toCharArray();
            arr2 = text2.toCharArray();
        }
        else {
            arr1 = text2.toCharArray();
            arr2 = text1.toCharArray();
        }
        int[] dp = new int[arr2.length+1];
        for (int i=arr1.length-1; i>=0; i--) {
            final char v1 = arr1[i];
            for (int j=arr2.length-1, p=0, t; j>=0; j--) {
                if ( v1 == arr2[j] ) {
                    if (p == dp[j]) 
                        dp[j]++;
                    else if (p > dp[j]) {
                        t = p+1;
                        p = dp[j];
                        dp[j] = t;
                    }
                    else p = dp[j];
                }
                else {
                    p = dp[j];
                    if (dp[j+1] > dp[j])
                        dp[j] = dp[j+1];
                }
            }
        }
        
        return dp[0];
    }
    
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        int[] stack = new int[arr.length+1];
        int st_i = -1;
        long mod = (long)1e9 + 7;
        stack[++st_i] = -1;
        
        for (int i = 0; i < arr.length+1; i++){
            int val = i < arr.length ? arr[i] : 0;
            while ( stack[st_i] != -1 && val < arr[stack[st_i]] ) {
                int mid = stack[st_i--];
                int l = stack[st_i];
                int right = i - mid;
                int left = mid - l;
                
                ans += ((long)left * right * arr[mid]);
                ans = ans % mod;
            }
            
            stack[++st_i] = i;
        }
        
        return (int)ans;
    }
}
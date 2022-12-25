class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int [] ans = new int [queries.length];
        
        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }
        
        for(int i=0; i<queries.length; i++){
            
            if(nums[n-1] <= queries[i]){
                ans[i] = n;
                continue;
            }
            
            for(int j=0; j<n; j++){
                if(nums[j] > queries[i]){
                    ans[i] = j;
                    break;
                }
            }
        }
        
        return ans;
    }

}
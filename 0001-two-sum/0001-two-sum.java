class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int j=1;
        while(j<len){
            for(int i=0; i+j<len; i++){
                if(nums[i]+nums[i+j]==target){
                    return new int[] {i, i+j};
                }
            }
            j++;
        }
        return null;
    }
}
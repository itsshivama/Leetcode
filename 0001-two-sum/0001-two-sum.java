class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int ret[] = new int[2];
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]+nums[j]==target){
                 ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }
}
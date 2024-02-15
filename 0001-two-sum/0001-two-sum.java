class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int ret[] = new int[2];
        int j=1;
        while(j<len){
            for(int i=0; i+j<len; i++){
                if(nums[i]+nums[i+j]==target){
                    ret[0]=i;
                    ret[1]=i+j;
                }
            }
            j++;
        }
        return ret;
    }
}
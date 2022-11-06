class Solution {
    public int[] applyOperations(int[] nums) {
        int l = nums.length;
        for(int i=1; i<l; i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]*=2;
                nums[i]=0;
            }
        }
        int ret[] = new int[l]; int t=0;
        for(int i = 0; i<l;i++){
            if(nums[i]!=0){
                ret[t++]=nums[i];
            }
        }
        return ret;
    }
}
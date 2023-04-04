class Solution {
    public void sortColors(int[] nums) {
        int[] max = new int[3];
        int i=0;
        for(i=0;i<nums.length;i++){
            max[nums[i]]++;
        }
        i=0;
        for(int j=0;j<3;j++){
            while(max[j]>0){
                nums[i++]=j;
                --max[j];
            }
        }
    }
}
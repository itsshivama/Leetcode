class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] arr = new int[2];
       int j = 1;

       while(j < nums.length){
           for(int i = 0; i+j < nums.length; i++){
               if(target == nums[i]+nums[i+j]){
                   arr[0] = i;
                   arr[1]= i+j;
                   return arr;
               }
           }
           j++;
       }
       return arr;
    }
}
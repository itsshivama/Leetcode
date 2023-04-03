class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] k = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    k[0] = i;
                    k[1] = j;
                    return k;
                }
            }
        }
        return k;
    }
}

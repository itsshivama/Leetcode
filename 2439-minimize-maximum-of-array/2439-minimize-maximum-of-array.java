class Solution {
    public int minimizeArrayValue(int[] nums) {
        
        double max = nums[0];
        double prefixSum = nums[0];
        
        
        for (int i=1; i<nums.length; i++)
        {
            double curr = nums[i];
            prefixSum += curr;
            
            if (curr > max)
            {
                max = Math.max(max, Math.ceil(prefixSum / (i+1)));
            }
            
        }
        
        return (int) max;
    }

}
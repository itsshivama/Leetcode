class Solution {
    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int currNum = nums[mid];

            if (currNum == target) {
                return mid;
            }

            if (nums[start] <= currNum) {

                if (target >= nums[start] && target < currNum) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
        
                if (target > currNum && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*
    
    class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low] <= nums[mid]){
                if(target <= nums[mid] && target >= nums[low]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else
            {
                if(target >= nums[mid] && target <= nums[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}

*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num))
                return true;
        }
        return false;
    }
}
    
//     Brute Force

//             for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j])
//                     return true;
//             }
//         }
//         return false;
//     }

// HashMap Method

// HashMap<Integer, Integer> map = new HashMap<>();
// for(int num: nums){
//     if(map.containsKey(num))
//         return true;
//     map.put(num, map.getOrDefault(num, 0)+1);
// }
// return false;
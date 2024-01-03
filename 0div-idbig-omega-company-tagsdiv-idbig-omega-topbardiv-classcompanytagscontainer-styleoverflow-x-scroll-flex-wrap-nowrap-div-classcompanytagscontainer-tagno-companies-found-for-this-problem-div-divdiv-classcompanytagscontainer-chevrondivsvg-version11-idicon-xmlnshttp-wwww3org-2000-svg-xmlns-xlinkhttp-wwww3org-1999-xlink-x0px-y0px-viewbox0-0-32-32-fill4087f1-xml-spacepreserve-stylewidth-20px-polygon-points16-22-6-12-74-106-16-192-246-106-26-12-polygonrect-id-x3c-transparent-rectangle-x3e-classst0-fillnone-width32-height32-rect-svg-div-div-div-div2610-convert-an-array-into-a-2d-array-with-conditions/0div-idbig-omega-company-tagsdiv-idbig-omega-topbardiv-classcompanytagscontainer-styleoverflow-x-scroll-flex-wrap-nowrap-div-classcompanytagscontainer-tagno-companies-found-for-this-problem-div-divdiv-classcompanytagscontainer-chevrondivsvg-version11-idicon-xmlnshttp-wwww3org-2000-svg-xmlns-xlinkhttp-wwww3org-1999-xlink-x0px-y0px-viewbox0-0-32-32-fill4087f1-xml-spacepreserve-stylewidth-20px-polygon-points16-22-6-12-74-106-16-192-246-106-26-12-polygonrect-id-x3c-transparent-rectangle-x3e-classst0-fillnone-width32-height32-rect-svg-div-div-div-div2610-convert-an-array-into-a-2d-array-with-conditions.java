class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int a[]=new int[nums.length+1];
        List<List<Integer>>ls=new ArrayList<>();
        for(int i:nums){
            if(a[i]>=ls.size()){
                ls.add(new ArrayList<>());
            }
            ls.get(a[i]).add(i);
            a[i]++;
        }
        return ls;
    }
}
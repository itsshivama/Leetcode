class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        long total = 0;
        int length = capacity.length;
        for(int i = 0; i < length; i++){
            capacity[i] -= rocks[i];
            total += capacity[i];
        }
        if(total > additionalRocks){
            Arrays.sort(capacity);
            for(int i = 0; i < length; i++){
                if(additionalRocks < capacity[i]){
                    return i;
                }
                additionalRocks -= capacity[i];
            }
        }
        return length;
    }
}
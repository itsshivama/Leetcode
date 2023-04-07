class Solution {

    public int bitwiseComplement(int num) {
        if(num==0)
            return 1;
        
        int complement = ~num; 
        // flip all bits of the original number
        
        int bit = Integer.highestOneBit(num) << 1; 
        // get the leftmost set bit and shift it one position to the left

        return complement & (bit - 1); 
        // mask out the extra 1's in the complement
    }
}

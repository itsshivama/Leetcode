class Solution {

    public int bitwiseComplement(int num) {
        if(num==0)
            return 1;
        int complement = ~num;  // flip all bits of the original number
        int bit = 1;
        while (num != 0) {
            num >>= 1;
            bit <<= 1;
        }
        return complement & (bit - 1);  // mask out the extra 1's in the complement
    }
}
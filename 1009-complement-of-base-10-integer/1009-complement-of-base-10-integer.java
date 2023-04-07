class Solution {

    public int bitwiseComplement(int num) {
        // Step 1: Convert the integer to binary representation
        String binary = Integer.toBinaryString(num);

        // Step 2: Flip all the 0's to 1's and 1's to 0's in the binary representation
        StringBuilder complementBuilder = new StringBuilder();
        for (char c : binary.toCharArray()) {
            if (c == '0') {
                complementBuilder.append('1');
            } else {
                complementBuilder.append('0');
            }
        }

        // Step 3: Convert the binary complement back to an integer and return it
        String complementBinary = complementBuilder.toString();
        int complement = Integer.parseInt(complementBinary, 2);
        return complement;
    }
}

class Solution 
{
    public String reverseWords(String s) 
    {
        return Arrays.stream(s.trim().split("\\s+"))
                     .reduce((w1, w2) -> w2 + " " + w1)
                     .orElse("");
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r = s.length()-1;
        while(l<=r){
            int templ = s.charAt(l), tempr = s.charAt(r);
            if(!Character.isLetterOrDigit(templ))
                l++;
            else if(!Character.isLetterOrDigit(tempr))
                r--;
            else if(Character.toLowerCase(templ)!=Character.toLowerCase(tempr))
                return false;
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}
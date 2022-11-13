class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int len = s.length();
        while(i<len){
            while(i<len&&s.charAt(i)==' ')
                i++;
            int j=0;
            while(i<len&&s.charAt(i)!=' '){
                sb.insert(j++,s.charAt(i));
                i++;
            }
            sb.insert(j,' ');
            i++;
        }
        return sb.toString().trim();
    }
}
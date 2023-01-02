class Solution {
    public boolean myWay(String word)
    {
        //simply check the 3 conditions
        int numCapital = 0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i))) numCapital++;
        }

        return (numCapital == word.length() || (numCapital == 0) ||
               (numCapital == 1 && Character.isUpperCase(word.charAt(0))));
    }

    public boolean detectCapitalUse(String word) {
        return myWay(word);//Tc->o(n)
    }
}
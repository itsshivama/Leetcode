//Char Manipulations

class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        char c[] = s.toCharArray();
        char k[] = new char[l];

        int j=0;
        for(int i = 0; i<l; i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                k[j++]=c[i];
                c[i]='\u0000';
            }
        }

        if(j==0)
            return new String(c);

         for(int i = 0; i<l; i++){
            if(c[i]=='\u0000'){
                c[i]=k[--j];
            }
        }

        return new String(c);

    }
}

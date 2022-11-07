class Solution {
    public int maximum69Number (int num) {
        char ar[] = String.valueOf(num).toCharArray(); 

            for(int i =0;i<ar.length;i++){    
                //because 9 is always greater than 6
                if(ar[i]=='6'){                        
                    ar[i]='9';
                    break;
                }

            }
            return Integer.parseInt(new String(ar));    
    }
}
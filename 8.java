class Solution {
    public int myAtoi(String str) {
        int i=0,ans=0;
        int j=0;
        boolean nflag=false;
        
        while(i<str.length()&&Character.isWhitespace(str.charAt(i))){
            i++;
        }
            if(i==str.length())
                return 0;
        if(str.charAt(i)=='+'){
            i++;
            nflag=false;
            j++;
        }
        if(i==str.length())
                return 0;
        if(str.charAt(i)=='-'){
            i++;
            j++;
            nflag=true;
        }
        
        if(j>1)
            return 0;
        
        for(;i<str.length();i++){
         if(str.charAt(i)>'9'||str.charAt(i)<'0')   
            break;
         else{
             int digit = str.charAt(i)-'0';
             if(!nflag&&ans>(Integer.MAX_VALUE-digit)/10)
                 return Integer.MAX_VALUE;
             else if(nflag&&ans<(Integer.MIN_VALUE+digit)/10)
                 return Integer.MIN_VALUE;
             ans=ans*10+(nflag?-digit:digit);
         }

        }    
            
        
        return ans;
        
    }
}
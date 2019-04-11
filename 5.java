class Solution {
    public String longestPalindrome(String s) {
       
        
         for(int i = s.length();i > 0; i--) {
             for(int j=0;j<=s.length()-i;j++) {
                 String sub = s.substring(j,i+j);
                if(isPal(sub))
                    return sub;
            }
         }
        
        
        return "";
    }
    
    public boolean isPal(String s){
        int len=s.length();
        for(int i=0;i<len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-i-1))
                return false;        
        } 
        
        return true;
    }
    
}
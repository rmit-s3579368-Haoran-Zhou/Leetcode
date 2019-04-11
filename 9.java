class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x>=0&&x<10)
            return true;
        
        String s = x+"";
        int len=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(len-1-i))
                return false;
            if(i==(len-1-i))
                break;
        }
        
        return true;
        
    }
}
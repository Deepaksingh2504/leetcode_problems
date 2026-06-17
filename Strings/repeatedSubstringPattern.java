// REPEATED SUBSTRING PATTERN

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        String ss=s+s;
        ss=ss.trim();
        if(ss.substring(1,ss.length()-1).contains(s))
        {
            return true;
        }
        return false;
    }
}

// SUBSTRING OF SIZE 3 WITH 3 DISTINCT CHARACTERS

class Solution {
    public int countGoodSubstrings(String s) {
       int count=0;
       for(int i=0;i<s.length();i++)
       {
        if(i+2<s.length() && s.charAt(i)!=s.charAt(i+1)&& s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2))
        {
            count++;
        }
       }
       return count;
    }
}

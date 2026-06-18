// permutation in string


class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int need[]=new int[26];
        int window[]=new int[26];

        for (char ch: s1.toCharArray())
        {
            need[ch-'a']++;
        }

        int left=0;
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            window[c-'a']++;
            
            while(i-left+1==s1.length())
            {
                if(Arrays.equals(need,window))
                {
                    return true;
                }
                char leftCharacter=s2.charAt(left);
                window[leftCharacter-'a']--;
                left++;

            }
        }
        return false;
    }
}

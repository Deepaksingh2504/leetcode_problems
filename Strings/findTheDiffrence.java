//  FIND THE DIFFRENCE

class Solution {
    public char findTheDifference(String s, String t) {
        
        char c[]=s.toCharArray();
        char v[]=t.toCharArray();
        char res=0;
        for(int i=0;i<c.length;i++)
        {
            res^=c[i];
        }
        for(int i=0;i<v.length;i++)
        {
            res^=v[i];
        }

        return res;
    }
}

// or using frequency array


class Solution {
    public char findTheDifference(String s, String t) {
        
        int freq[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
             freq[s.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                if(freq[i]==1)
                {
                    return (char)(i+'a');
                }
            }
        }return ' ';
    }
}

// FIND ALL ANAGRAMS IN A STRING

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int need[]=new int[26];
        int window[]=new int[26];

        List<Integer>list=new ArrayList<>();

        for(char ch: p.toCharArray())
        {
            need[ch-'a']++;
        }
        int left=0;

        for(int i=0;i<s.length();i++)
        {
            window[s.charAt(i)-'a']++;

            while(i-left+1==p.length())
            {
                if(Arrays.equals(need,window))
                {
                list.add(left);
                }

                window[s.charAt(left)-'a']--;
                left++;

            }
        }
        return list;
    }
}

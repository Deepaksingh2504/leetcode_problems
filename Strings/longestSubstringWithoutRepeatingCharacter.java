// LONGEST SUBSTRING WITHOUT REPEATING CHARACTER 


// USING ARRAY LIST


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int right=0;
        int maxLen=0;

        if(s.length()==0)
        {
            return 0;
        }

        
       
       ArrayList<Character>list=new ArrayList<>();
        while(right<s.length())
        {

            while(list.contains(s.charAt(right)))
            {
                
                 list.remove(0);
            }

            list.add(s.charAt(right));
            maxLen=(int)Math.max(list.size(),maxLen);

            right++;

        }
        return maxLen;
    }
}


// using hashset

int left=0;
        HashSet<Character>set=new HashSet<>();
        while(right<s.length())
        {
             char ch=s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }

            
             set.add(ch);
              maxLen=(int)Math.max(maxLen,set.size());
           

            right++;
        }

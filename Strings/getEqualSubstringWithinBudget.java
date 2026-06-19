// Get Equal Substrings Within Budget


class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        
        char ch[]=s.toCharArray();
        int left=0;
        int right=0;

        int maxLen=0;
        int cost=0;
        while(right<s.length())
        {
            char sCharacter=s.charAt(right);
            char tCharacter=t.charAt(right); 

             cost+=(int)Math.abs(sCharacter-tCharacter);

             if(cost<=maxCost)
            { 
                maxLen=(int)Math.max(maxLen,right-left+1);
            }       
            while(cost>maxCost)
            {
              int leftCharacterCost=(int)Math.abs(s.charAt(left)-t.charAt(left));
              cost-=leftCharacterCost;
              left++;
            }  

              
         
            right++;

        }
        return maxLen;
    }
}

// MAXIMIZE THE CONFUSION OF EXAM

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int right=0;
        int left=0;

        int maxLen=0;
        int maxValue=Integer.MIN_VALUE;

        int freq[]=new int[26];

        while(right<answerKey.length())
        {
            char ch=answerKey.charAt(right);
            freq[ch-'A']++;
            maxValue=(int)Math.max(maxValue,freq[ch-'A']);

            if((right-left+1)-maxValue<=k)
            {
                maxLen=(int)Math.max(maxLen,right-left+1);
            }

            while((right-left+1)-maxValue>k)
            {
                char c=answerKey.charAt(left);
                freq[c-'A']--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}

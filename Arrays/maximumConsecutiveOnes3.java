// MAXIMUM CONSECUTIVE 3

class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int freq[]=new int[26];

        int left=0;
        int right=0;
        int maxLen=0;

        while(right<nums.length)
        {
            int num=nums[right];
            
            freq[num]++;

             if((right-left+1)-freq[1]<=k)
            {
                maxLen=(int)Math.max(maxLen,right-left+1);
            }

                while((right-left+1)-freq[1]>k)
            {
                int n=nums[left];
                freq[n]--;
                left++;
            }

            right++;
        }

        return maxLen;
    }
}

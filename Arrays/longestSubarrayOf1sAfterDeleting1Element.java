// LONGEST SUBARRAY OF 1s AFTER DELETING 1 ELEMENT

class Solution {
    public int longestSubarray(int[] nums) {
        
        int freq[]=new int[26];

        int left=0;
        int right=0;
        int maxLen=0;
       
        while(right<nums.length)
        {
            int n=nums[right];
            freq[n]++;

            if((right-left+1)-freq[1]<=1)
            {
                maxLen=(int)Math.max(maxLen,right-left);
            }

            while((right-left+1)-freq[1]>1)
            {
                int out=nums[left];
                freq[out]--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}

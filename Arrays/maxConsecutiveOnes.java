// Maximum consecutive ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int left=0;
        int right=0;
        int count=0;
        int maxCount=0;

        while(right<nums.length)
        {
            if(nums[right]==1)
            {
             count++;
             right++; 
             maxCount=(int)Math.max(maxCount,count);  
            }
            else 
            {
                count=0;   
                right++;
            }
            
        }
        return maxCount;
    }
}

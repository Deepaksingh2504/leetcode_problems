// FIND PIVOT INDEX

class Solution {
    public int pivotIndex(int[] nums) {
        
        int preffixSum[]=new int[nums.length];

        preffixSum[0]=nums[0];

        for (int i=1; i<nums.length; i++)
        {
            preffixSum[i]=preffixSum[i-1]+nums[i];
        }

        int leftSum=0;
        int rightSum=0;
        int totalSum=preffixSum[nums.length-1];
        for(int i=0; i<nums.length; i++)
        {

            if(i==0)
            {
                leftSum=0;
            }
            else if(i==nums.length-1)
            {
                leftSum=preffixSum[nums.length-2];
            }
              else 
            {
                 leftSum=preffixSum[i-1];
            }
           
            rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum)
            {
                return i;
            }
        }
    return -1;
    }
}

// OR 

class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum=0;

        for (int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++)
        {   
            rightSum=totalSum-leftSum-nums[i];
             if(leftSum==rightSum)
            {
                return i;
            }
            leftSum+=nums[i];

        }
        return -1;
    }
}

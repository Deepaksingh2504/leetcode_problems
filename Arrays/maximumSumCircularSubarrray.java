// MAXIMUM SUM CIRCULAR SUBARRAY

class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int sum=0;
        int sum1=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int totalSum=0;
        int k=nums.length;

        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
            
            sum=(int)Math.max(sum+nums[i],nums[i]);
            maxSum=(int)Math.max(sum,maxSum);

            sum1=(int)Math.min(sum1+nums[i],nums[i]);
            minSum=(int)Math.min(sum1,minSum);
        }
        if(maxSum<0)
        {
            return maxSum;
        }
        
        return (int)Math.max(maxSum,totalSum-minSum);
    }
}

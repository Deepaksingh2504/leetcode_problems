// MAXIMUM AVERAGE SUBARRAY 1

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
     
     int left=0;
     int right=0;
     double avg=Double.NEGATIVE_INFINITY;
     double maxAvg=Double.NEGATIVE_INFINITY;
     int sum=0;
     while(right<nums.length)
     {
        sum+=nums[right];

        while(right-left+1==k)
        {
            avg=sum/(double)k;
            maxAvg=Math.max(avg,maxAvg);
            sum-=nums[left];
            left++;
        }
        right++;
     }
     return maxAvg;
    }
}

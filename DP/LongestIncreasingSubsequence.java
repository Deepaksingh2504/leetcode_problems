// longest increasing subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int dp[][]=new int[nums.length+1][nums.length+1];

        for(int i=0;i<dp.length;i++)
        {
                  Arrays.fill(dp[i],-1);
        }
    
       return solve(nums,0,-1,dp);
        
        
    }

    int solve(int nums[],int i,int prev,int dp[][])
    {
        if(i==nums.length)
        {
            return 0;
        }

        if(prev!=-1 && dp[i][prev]!=-1)
        {
            return dp[i][prev];
        }
        int take=0,skip=0;

        if( prev==-1||nums[i]>nums[prev] )
        {
            take= 1+solve(nums,i+1,i,dp);
        }

            skip=solve(nums,i+1,prev,dp);

            if(prev!=-1)
            {
               dp[i][prev]=(int)Math.max(take,skip);
            }

            return Math.max(take,skip);
    }
}

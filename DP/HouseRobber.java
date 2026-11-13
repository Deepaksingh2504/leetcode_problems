// house robber

class Solution {
    public int rob(int[] nums) {
        
        int dp[][]=new int[nums.length+1][2];

        for(int i=0;i<nums.length+1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
       return solve(nums,0,1,dp);

    }

    int solve(int nums[],int i,int j,int dp[][])
    {
        if(i==nums.length)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
    int take=0;
    
    if(j==1)
    {
        take=nums[i]+solve(nums,i+1,0,dp);
    }
        int skip=solve(nums,i+1,1,dp);

   dp[i][j]= Math.max(take,skip);
        return Math.max(take,skip);
    }
}

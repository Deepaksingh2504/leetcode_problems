class Solution {
    public int rob(int[] nums) {

        if(nums.length==1)
        {
            return nums[0];
        }
        int dp1[][]=new int[nums.length+1][2];
         int dp2[][]=new int[nums.length+1][2];

        for(int i=0;i<nums.length+1;i++)
        {
            Arrays.fill(dp1[i],-1);
             Arrays.fill(dp2[i],-1);
        }

        int case1=solve(nums,0,nums.length-2,0,dp1);
        int case2=solve(nums,1,nums.length-1,0,dp2);

        return Math.max(case1,case2);
    }

    int solve(int nums[],int i,int j,int k,int dp[][])
    {
        if(i>j)
        {
            return 0;
        }
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }

        int take=0;
        int skip=0;

        if(k==0)
        {
            take=nums[i]+solve(nums,i+1,j,1,dp);
        }
        skip=solve(nums,i+1,j,0,dp);
    
        return dp[i][k]=Math.max(take,skip);
    }
}

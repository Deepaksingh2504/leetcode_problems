// burst balloon

class Solution {
    public int maxCoins(int[] nums) {
        
        int dp[][]=new int[nums.length+1][nums.length+1];

        for(int row[]:dp)
        {
        Arrays.fill(row,-1);
        }

        return solve(nums,0,nums.length-1,dp);
    }

    int solve(int nums[],int i,int j,int dp[][])
    {
        if(i>j)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int maxScore=Integer.MIN_VALUE;
        int score=0;
        for(int k=i;k<=j;k++)
        {
            int left=i-1>=0?nums[i-1]:1;
            int right=j+1<nums.length?nums[j+1]:1;
           score=left*nums[k]*right+solve(nums,i,k-1,dp)+solve(nums,k+1,j,dp);

            maxScore=Math.max(maxScore,score);

            dp[i][j]=maxScore;
        }

        return maxScore;
    }
}

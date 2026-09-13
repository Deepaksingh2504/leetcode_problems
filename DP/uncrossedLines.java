// uncrossed Line

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        
        int dp[][]=new int[nums1.length+1][nums2.length+1];

        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        LCS(nums1,nums2,nums1.length,nums2.length,dp);
        return dp[nums1.length][nums2.length];
    }

    int LCS(int nums1[],int nums2[],int i,int j, int dp[][])
    {
        if(i==0|| j==0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(nums1[i-1]==nums2[j-1])
        {
            return dp[i][j]= 1+LCS(nums1,nums2,i-1,j-1,dp);
        }

        return dp[i][j]= (int)Math.max(LCS(nums1,nums2,i,j-1,dp),LCS(nums1,nums2,i-1,j,dp));

    }
}

// minimum path sum


class Solution {

    public int minPathSum(int[][] grid) {
        
        int dp[][]=new int[grid.length+1][grid[0].length+1];

        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
       return solve(grid,grid.length-1,grid[0].length-1,dp);

    }

   int solve(int grid[][],int i,int j,int dp[][])
    {
        if(i==0 && j==0)
        {
            return grid[0][0];
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int top=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;

        if(i-1>=0)
        {
        top=solve(grid,i-1,j,dp)+grid[i][j];
        }
        if(j-1>=0)
        {
    
        right=solve(grid,i,j-1,dp)+grid[i][j];
        }

        return dp[i][j]=Math.min(top,right);
    }
}


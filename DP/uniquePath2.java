// unique path 2

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        if(grid[grid.length-1][grid[0].length-1]==1||grid[0][0]==1)
        {
            return 0;
        }

        int dp[][]=new int[grid.length][grid[0].length+1];

        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return solve(grid,grid.length-1,grid[0].length-1,dp);
    }

    int solve(int grid[][],int i,int j,int dp[][])
    {
        if(i==0&&j==0)
        {
            return 1;
        }

        int left=0;
        int top=0;

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(i-1>=0 && grid[i-1][j]!=1)
        {
           top= solve(grid,i-1,j,dp);
        }
         if(j-1>=0 && grid[i][j-1]!=1)
        {
            left=solve(grid,i,j-1,dp);
        }

        return dp[i][j]=left+top;
    }
}

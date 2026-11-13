//perfect Square

  class Solution {
    public int numSquares(int n) {
        
        int value=(int)Math.sqrt(n);
        int dp[][]=new int[value+1][n+1];

        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
       return solve(n,value,dp);

    }

    int solve(int n,int i,int dp[][])
    {
        if(n==0)
        {
            return 0;
        }
        if(i==0)
        {
            return 100000;
        }

        if(dp[i][n]!=-1)
        {
            return dp[i][n];
        }

        if(i*i<=n)
        {
            return dp[i][n]= Math.min(1+solve(n-i*i,i,dp),solve(n,i-1,dp));
        }
        return  dp[i][n]= solve(n,i-1,dp);
    }
}

// minimum falling path sum

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int result=Integer.MAX_VALUE;
        int dp[][]=new int[matrix.length][matrix[0].length];

        for(int i=0;i<dp.length;i++)
        {
          Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
            for(int i=0;i<matrix[0].length;i++)
            {
                int res=solve(matrix,0,i,dp);
                result=Math.min(result,res);
            }
            return result;
    }

       int  solve(int matrix[][],int i,int j,int dp[][])
        {
            
            if(i==matrix.length-1)
            {
                return matrix[i][j];
            }

            if(dp[i][j]!=Integer.MAX_VALUE)
            {
                return dp[i][j];
            }
            int bottom=Integer.MAX_VALUE;
            int bottomLeft=Integer.MAX_VALUE;
            int bottomRight=Integer.MAX_VALUE;

            if(i+1<matrix.length)
            {
               bottom=matrix[i][j]+ solve(matrix,i+1,j,dp);
            }

             if(i+1<matrix.length && j-1>=0)
            {
               bottomLeft=matrix[i][j]+ solve(matrix,i+1,j-1,dp);
            }

            if(i+1<matrix.length && j+1<matrix[0].length)
            {
               bottomRight=matrix[i][j]+ solve(matrix,i+1,j+1,dp);
            }

            return dp[i][j]= Math.min(bottom,Math.min(bottomRight,bottomLeft));
        }
}

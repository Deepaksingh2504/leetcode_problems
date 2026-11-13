// dungeon game

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        
        int dp[][]=new int [dungeon.length+1][dungeon[0].length+1];

        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }

       return solve(dungeon,0,0,dp);
    }

    int solve(int dungeon[][],int i,int j,int dp[][])
    {

         if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(i==dungeon.length-1 && j==dungeon[0].length-1)
        {
            if(dungeon[i][j]<=0)
            {
                return Math.abs(dungeon[i][j])+1;
            }
            else
            {
                return 1;
            }
        }


        if(i>=dungeon.length || j>=dungeon[0].length )
        {
            return Integer.MAX_VALUE;
        }

           int top=solve(dungeon,i+1,j,dp); 
           int right=solve(dungeon,i,j+1,dp);
        

        int required= Math.min(top,right)-dungeon[i][j];

     

        return dp[i][j]=Math.max(1,required);
    }
}


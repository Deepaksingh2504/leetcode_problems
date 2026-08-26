// number of islands


class Solution {
    public int numIslands(char[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        
        int visited[][]=new int [m][n];

        int numberOfIsland=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                     if(visited[i][j]==0 && grid[i][j]!='0')
                     {
                        numberOfIsland++;
                        dfs(i, j,visited,grid);
                     }
            }
        }
        return numberOfIsland;
    }

    void dfs(int i,int j,int visited[][],char grid[][])
    {    
        if(i<0 || i>=visited.length || j<0 || j>=visited[0].length)
        {
            return;
        }

        if(visited[i][j]==0 && grid[i][j]=='1')
        {
             visited[i][j]=1;
        
             dfs(i+1,j,visited,grid);
               dfs(i-1,j,visited,grid);
                dfs(i,j+1,visited,grid);
                dfs(i,j-1,visited,grid);
        }
       
     }
}

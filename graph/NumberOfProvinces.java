//Number of provinces

class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int noOfProvinces=0;
        boolean visited[]=new boolean[isConnected.length];
        
        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i])
            {
                noOfProvinces++;
                dfs(i,isConnected,visited);
            }


        }

    return noOfProvinces;
    }

  static void  dfs(int node, int[][]adj,boolean visited[])
    {
        visited[node]=true;

        for(int i=0;i<adj[node].length;i++)
        {
            if(adj[node][i]==1 && !visited[i])
            {
                dfs(i,adj,visited);
            }
        }
    }
}

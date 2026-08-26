// Rotten oranges

class Solution {

    private  int minutes=0;

   public class Pair
    {
        int m,n;

        Pair(int m,int n)
        {
            this.m=m;
            this.n=n;
        }
    }

    public int orangesRotting(int[][] grid) {

        int row=grid.length;
        int col=grid[0].length;
        
       Queue<Pair>q=new LinkedList<>();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                q.offer(new Pair(i,j));
                }
            }
        }

                bfs(q,grid);

         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
        return minutes;
        
    }


        void bfs( Queue<Pair> q, int grid[][])
        {
            int direction[][]={{1,0},{-1,0},{0,1},{0,-1}};


            while(! q.isEmpty())
            {       
                int size=q.size();
                boolean rotten=false;

                for(int c=0;c<size;c++)
                {
                Pair p=q.poll();

            int row=p.m;
            int col=p.n;

            for(int i=0;i<direction.length;i++)
            {
                int newRow=row+direction[i][0];
                int newCol=col+direction[i][1];

                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1 )
                {
                    q.offer(new Pair(newRow,newCol));
                    grid[newRow][newCol]=2;
                    rotten=true;
                }
            }

                }
                if(rotten)
                {
                minutes++;
                }
            }
        } 
    }

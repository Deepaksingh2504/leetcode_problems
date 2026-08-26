// course schedule

class Solution {
    
    private Stack<Integer>stack=new Stack<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    
    ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();

    for(int i=0;i<numCourses;i++)
    {
        adjList.add(new ArrayList<>());
    }



    for(int [] arr:prerequisites)
    {
        int u=arr[0];
        int v=arr[1];

        adjList.get(v).add(u);
    }
     boolean visited1[]=new boolean[numCourses];
     boolean recursionPath[]=new boolean[numCourses];
     
    boolean cyclePresent=false;

    for(int i=0;i<numCourses;i++)
         {
            if(!visited1[i])
            {
              cyclePresent=cycleExistOrNot(i,adjList,visited1,recursionPath);
                if(cyclePresent)
         {
            int ar[]=new int[0];
            return ar;
         }
            }
            
         }

       
         boolean visited[]=new boolean[numCourses];

         for(int i=0;i<numCourses;i++)
         {
            if(!visited[i])
            {
                dfs(i,visited,adjList,stack);
            }
            
         }
        
        int res[]=new int[stack.size()];
        int k=0;
        while(!stack.isEmpty())
        {
            res[k++]=stack.pop();
        }
        

        return res;
    }

    void dfs(int node ,boolean visited[],ArrayList<ArrayList<Integer>>list,Stack<Integer>stack)
    {
        visited[node]=true;

        for(int i=0;i<list.get(node).size();i++)
        {
            if(!visited[list.get(node).get(i)])
            {
                 dfs(list.get(node).get(i),visited,list,stack);
            }
        }
        
        stack.push(node);
    }

    boolean cycleExistOrNot(int current,ArrayList<ArrayList<Integer>>list,boolean visited[],boolean recursionPath[])
    {
         visited[current]=true;
         recursionPath[current]=true;

        for(int i=0;i<list.get(current).size();i++)
        {
            if(!visited[list.get(current).get(i)])
            {
                 if(cycleExistOrNot(list.get(current).get(i),list,visited,recursionPath))
                 {
                    return true;
                 }

            }else if(visited[list.get(current).get(i)] && recursionPath[list.get(current).get(i)])
            {
                return true;
            }
        }
        recursionPath[current]=false;
        return false;
        
    }
}

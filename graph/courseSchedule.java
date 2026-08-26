// course schedule

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

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

        boolean visited[]=new boolean[numCourses];
        boolean recursionPath[]=new boolean[numCourses];

        boolean canBeScheduled=false;
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
            canBeScheduled=cycleCheck(i,adjList,visited,recursionPath);

            if(canBeScheduled)
            {
                return false;
            }
            }

        }
        return true;

    }

    boolean cycleCheck(int node,ArrayList<ArrayList<Integer>>list,boolean visited[],boolean recursionPath[])
    {
        visited[node]=true;
        recursionPath[node]=true;

        for(int i=0;i<list.get(node).size();i++)
        {
            if(!visited[list.get(node).get(i)])
            {
                if(cycleCheck(list.get(node).get(i),list,visited,recursionPath))
                {
                    return true;
                }
            }else if(visited[list.get(node).get(i)] && recursionPath[list.get(node).get(i)])
            {
                return true;
            }
        }
        recursionPath[node]=false;
        return false;

    }
}

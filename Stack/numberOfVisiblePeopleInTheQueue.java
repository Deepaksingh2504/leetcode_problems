// NUMBER OF VISIBLE PEOPLE IN THE QUEUE

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        
        Stack<Integer>stack=new Stack<>();
        int nge[]=new int[heights.length];

        for(int i=heights.length-1;i>=0;i--)
        {
            int val=heights[i];
            int count=0;
            while(!stack.isEmpty() && heights[stack.peek()]<=val)
            {       
                stack.pop();
                count++;
            }
            if(!stack.isEmpty())
            {
                nge[i]=count+1;
            }
            else
            {
                nge[i]=count;
            }
            stack.push(i);
        
        }
        return nge;
    
}
}

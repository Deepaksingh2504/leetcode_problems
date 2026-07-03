// DAILY TEMPERATURES

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer>stack=new Stack<>();
       int nge[]=new int[temperatures.length];


        for(int i=temperatures.length-1;i>=0;i--)
        {
            int val=temperatures[i];
            while(!stack.isEmpty() &&  temperatures[stack.peek()]<=val)
            {
                stack.pop();
            }

            if(!stack.isEmpty())
            {
               nge[i]= stack.peek()-i;
            }
            else
            {
                nge[i]=0;
            }
            stack.push(i);
        }

        return nge;
    }
}

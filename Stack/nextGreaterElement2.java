// NEXT GREATER ELEMENT 2

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer>stack=new Stack<>();
        int nge[]=new int[nums.length];
        for(int i=(2*nums.length)-1;i>=0;i--)
        {
            int val=nums[i%nums.length];
            while(!stack.isEmpty() && stack.peek()<=val)
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                nge[i%nums.length]=-1;
            }
            else
            {
                nge[i%nums.length]=stack.peek();
            }
            stack.push(val);

        }

        return nge;

    }
}

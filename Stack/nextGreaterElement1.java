// NEXT GREATER ELEMENT 1

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int nge[]=new int[nums1.length];
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--)
        { 
            int val=nums2[i];

            while(!stack.isEmpty() && stack.peek()<=val)
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                map.put(val,-1);
            }
            else
            {
                map.put(val,stack.peek());
            }

            stack.push(val);
        }

        for(int i=0;i<nums1.length;i++)
        {
            nge[i]=map.get(nums1[i]);
        }
        return nge;
    }
}

// CONTIGIOUS ARRAY

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer>map=new HashMap<>();

        int len=0;
        map.put(0,-1);
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i]==0?-1:1;

            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else
            {
                len=(int)Math.max(len,i-map.get(sum));
            }
        }
        return len;
    }
}

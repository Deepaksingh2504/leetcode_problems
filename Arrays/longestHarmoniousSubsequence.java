// Longest Harmonious Subsequence

class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int longest=0;
    
        for(int n :map.keySet())
        {
            if(map.containsKey(n+1))
            {
                longest=(int)Math.max(longest,map.get(n)+map.get(n+1));
            }
            else
            {
                continue;
            }
        }
        return longest;
    }
}

// LONGEST CONSECUTIVE SEQUENCE

// BRUTE FORCE 

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        int maxCount=0;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            
            while(set.contains(nums[i]))
            {
                 nums[i]++;
                count++;
                maxCount=(int)Math.max(maxCount,count);

               
            }
            count=0;

        }
        return maxCount;
    }
}

// OPTIMAL SOLUTION


class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer>set=new HashSet<>();

        for (int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        int maxCount=0;

        for(int v: set)
        {
            if(!set.contains(v-1))
            {
                int count=0;

                while(set.contains(v))
                {
                    v++;
                    count++;
                }
                maxCount=(int)Math.max(count,maxCount);
            }

        }
        return maxCount;
    }
}

//NEXT PERMUTATION


class Solution {
    public void nextPermutation(int[] nums) {
        
        int pivot=-1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }

        int justGreaterElement=0;

        if(pivot!=-1)
        {
        for(int i=nums.length-1;i>=0;i--)
        {
                if(nums[i]>nums[pivot])
                {
                    justGreaterElement=i;
                    break;
                }
        }

        int temp=nums[justGreaterElement];
        nums[justGreaterElement]=nums[pivot];
        nums[pivot]=temp;

         swap(pivot+1,nums.length-1,nums);

        }
        else
        {
        swap(0,nums.length-1,nums);
        }
    }

    void swap(int i,int j,int []nums)
    {
        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }
    }
}

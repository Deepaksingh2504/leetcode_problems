// SEARCH IN ROTATED SORTED ARRAY

class Solution {
    public int search(int[] nums, int target) {
        
        int pivot=findPivot(nums);
        int x=-1;

        if(target==nums[pivot])
        {
            return pivot;
        }

        if(target>nums[pivot] && target <=nums[nums.length-1])
        {
          x=  search(nums,pivot,nums.length-1,target);
        }
        else
        {
          x=  search(nums,0,pivot-1,target);
        }

        return x;
    }

    static int findPivot(int nums[])
    {
        int i=0;
        int j=nums.length-1;


        while(i<j)
        {
            int mid=i+(j-i)/2;

            if(nums[mid]>nums[j])
            {
                i=mid+1;
            }
            else
            {
                j=mid;
            }

        }
        return i;
    }

    static int search(int nums[],int i ,int j,int target)
    {
        while(i<=j)
        {
            int mid=i+(j-i)/2;

            if(nums[mid]==target)
            {
                return  mid;
            }

            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return -1;
    }
}

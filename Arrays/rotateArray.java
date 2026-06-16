// rotate array  by right  k position

class Solution {
    public void rotate(int[] nums, int k) {
        
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
       
    }

    static void swap(int nums[],int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }
    }
}

// rotate array by left k position

class Solution {
    public void rotate(int[] nums, int k) {
        
       
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        swap(nums,0,nums.length-1);
       
    }

    static void swap(int nums[],int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }
    }
}

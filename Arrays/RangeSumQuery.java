# range sum query - immutable

class NumArray {
    
    int preffixSum[];
    public NumArray(int[] nums) {
        
         preffixSum=new int[nums.length];
    
        preffixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            preffixSum[i]=preffixSum[i-1]+nums[i];
        }
    
    }
    
    public int sumRange(int left, int right) {

            if(left==0)
            {
                return preffixSum[right];
            }
        
            return preffixSum[right]-preffixSum[left-1];

    }
}


// jump game 

class Solution {
    public boolean canJump(int[] nums) {
        
    
        boolean dp[]=new boolean[nums.length];
        dp[nums.length-1]=true;

        for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=1;j<=nums[i];j++)
            {
                dp[i]=dp[i]||dp[i+j];
            }
        }
        return  dp[0];

    }
}


// class Solution {
//     public boolean canJump(int[] nums) {
        
//         return  solve(nums,0);

//     }
//     boolean solve(int nums[],int i)
//     {
//         boolean take=false;
//         boolean skip=false;

//         if(i>=nums.length-1)   
//         {
//             return true;
//         }
//         for(int j=1;j<=nums[i];j++)
//         {
//         take=take||solve(nums,i+j); 
//         }         

//         return take;
//     }
// }

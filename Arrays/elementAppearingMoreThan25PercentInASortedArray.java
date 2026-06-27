// ELEMENT APPEARING MORE THAN 25% IN A SORTED ARRAY

class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            
            if(arr[i]==arr[i-1])
            {
                count++;

                if(count>=arr.length/4)
                {
                    return arr[i];
                }
            }
            else
            {
                count=0;
            }
        }
        if(arr.length==1)
        {
            return arr[0];
        }
        return -1;
    }
}

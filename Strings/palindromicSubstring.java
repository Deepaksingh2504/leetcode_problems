// PALINDROMIC SUBSTRING 


class Solution {
    public int countSubstrings(String s) {
        
        int right=0;
        int count=0;

        while(right<s.length())
        {
          count+=  expand(s,right,right);
          count+=  expand(s,right,right+1);

          right++;
        }
        return count;
    }

    static int expand(String a,int left,int right )
    {
        int count=0;

        while(left>=0 && right<a.length())
        {
            if(a.charAt(left)!=a.charAt(right))
            {
                return count;
            }
            count++;
            right++;
            left--;
        }
        return count;
    }
}

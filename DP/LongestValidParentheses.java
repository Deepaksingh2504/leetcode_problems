// longest valid parentheses

class Solution {
    public int longestValidParentheses(String s) {
        int right=0;
        int left=0;

        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                right++;
            }
            else if(s.charAt(i)==')')
            {
                left++;
            }
            if(right==left)
            {
                max=Math.max(max,right*2);
            }
            else if(left>right)
            {
                right=0;
                left=0;
            }
        }
        right=0;left=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
            {
                right++;
            }
            else
            {
                left++;
            }
            
            if(left==right)
            {
                max=Math.max(max,right*2);
            }
            else if(left<right)
            {
                right=0;
                left=0;
            }
        }

        return max;

    }
}

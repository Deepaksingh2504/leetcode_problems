// VALID PALINDROME

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        StringBuilder sb=new StringBuilder();

        char ch[]=s.toCharArray();

        for(char c:ch)
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }
        }

        StringBuilder rev=new StringBuilder();

        for(int i=sb.length()-1;i>=0;i--)
        {
            rev.append(sb.charAt(i));
        }
        if(sb.toString().equals(rev.toString()))
        {
            return true;
        }
        return false;
    }
}

// OPTIMAL SOLUTION
class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.trim().toLowerCase();
        int i=0;
        int j=s.length()-1;
        

        while(i<=j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }
            else
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    
                    return false;
                }
                i++;j--;
            }

        }
        return true;
    }
}

// VALID PARENTHESES

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character>stack=new Stack<>();

        if(s.length()==1)
        {
            return false;
        }

        if(s.charAt(0)=='}'||s.charAt(0)==')' || s.charAt(0)==']')
        {
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

             if(ch=='[' || ch=='{' || ch=='(')
            {
                stack.push(ch);
            }

            else if(ch==']')
            {
                if(!stack.isEmpty() && stack.peek()=='[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(ch=='}')
            {
                if(!stack.isEmpty() && stack.peek()=='{')
                {
                    stack.pop();
                }
                 else
                {
                    return false;
                }
            }
            else if(ch==')')
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                 else
                {
                    return false;
                }
            }
        }

        return stack.size()==0?true :false;
    }
}

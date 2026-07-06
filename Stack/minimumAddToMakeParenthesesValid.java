// MINIMUM ADD TO MAKE PARENTHESES VALID

class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(stack.isEmpty())
            {
                stack.push(ch);
                continue;
            }

            if(!stack.isEmpty() && stack.peek()=='(' && ch==')')
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }


        }

        return stack.size();
    }
}

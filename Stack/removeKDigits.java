// remove K digit

class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<num.length();i++)
        {
            int n=num.charAt(i)-'0';

            if(stack.isEmpty())
            {
                stack.push(n);
                continue;
            }

            if(stack.peek()>n)
            {
                while(!stack.isEmpty() &&k>0 && stack.peek()>n)
                {
                    stack.pop();
                    k--;
                }
                stack.push(n);
            }
            else
            {
                stack.push(n);
            }
        }

        while(k>0)
        {
        stack.pop();
        k--;
        }

        Stack<Integer>stack2=new Stack<>();

        while(!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }

        StringBuilder sb=new StringBuilder();

         while(!stack2.isEmpty())
        {
            sb.append(stack2.pop());
        }

        int index=0;
        while(index<sb.length() && sb.charAt(index)=='0')
        {
            index++;
        }

        if(index==sb.length())
        {
            return "0";
        }

        return sb.length()==0?"0":sb.toString().substring(index,sb.length());
    }
}

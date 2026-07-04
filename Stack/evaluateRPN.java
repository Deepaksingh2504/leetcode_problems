//evaluate RPN

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<tokens.length;i++)
        {
            if(!tokens[i].equals("+") && !tokens[i].equals("*")&&!tokens[i].equals("-")&& !tokens[i].equals("/"))
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else
            {
                int num1 =stack.pop();
                int num2=stack.pop();
               int v= calculate(num1,num2,tokens[i]);
               stack.push(v);
            }
        }
        return stack.peek();
    }

    static int calculate( int n1, int n2 , String s)
    {
        int val=0;
        switch(s)
        {
            case "+":
            val= n2+n1;
            break;

            case "*":
            val= n2*n1;
            break;

            case "-":
            val= n2-n1;
            break;

            case "/":
            if(n1==0){
                val=0;
                break;
            }
            val= n2/n1;
            break;

        }

        return val;
    }
}

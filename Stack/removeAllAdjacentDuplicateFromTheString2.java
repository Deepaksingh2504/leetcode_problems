// REMOVE ALL ADJACENT DUPLICATE FROM THE STRING 2

class Solution {
    public String removeDuplicates(String s, int k) {
        

        Stack<Pair<Character,Integer>>stack=new Stack<>();
        Stack<Character>word=new Stack<>();
        

        for(int i=0;i<s.length();i++)
        {
            int count=stack.size()==0?0:stack.peek().getValue();
            char ch=s.charAt(i);

             if(!stack.isEmpty() && stack.peek().getKey()==ch)
            {
                count++;
                stack.push(new Pair<>(ch,count));
            }
            else
            {
                count=1;
                stack.push(new Pair<>(ch,count));
            }

            if(count==k)
            {
            for (int j = 0; j < k && !stack.isEmpty(); j++) 
            {
                stack.pop();
            }
            }


        }

        while(!stack.isEmpty())
        {
            word.push(stack.pop().getKey());
        }

        StringBuilder sb=new StringBuilder();
        
         while(!word.isEmpty())
        {
           sb.append(word.pop());
        }

        return sb.toString();
    }
}


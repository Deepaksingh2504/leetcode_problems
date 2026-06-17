// KEYBOARD ROW

class Solution {
    public String[] findWords(String[] words) {
    
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s="";
            boolean absent=false;
            String w=words[i].toLowerCase();
            if("qwertyuiop".contains(String.valueOf(w.charAt(0))))
            {
                  s="qwertyuiop";
            }
            else if("asdfghjkl".contains(String.valueOf(w.charAt(0))))
            {
                   s="asdfghjkl";
            }
            else
            {
                   s="zxcvbnm";
            }


            for(int j=0;j<w.length();j++)
            {   
                if(!s.contains(String.valueOf(w.charAt(j))))
                {
                    absent=true;
                }
                if(absent)
                {
                    break;
                }
                
            }
            if(absent==false)
            {
                list.add(words[i]);
            }


        }
        String arr[]=new String[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }

        return arr;
    }
}

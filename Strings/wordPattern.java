// WORD PATTERN 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String>map=new HashMap<>();
     
        String[]word=s.split(" ");

        HashSet<String>set=new HashSet<>();

        if(pattern.length()!=word.length)
        {
            return false;
        }
        

        for(int i=0;i<pattern.length();i++)
        {
            char p=pattern.charAt(i);
            String st=word[i];
            

            if(map.containsKey(p))
            {
                if(!map.get(p).equals(st))
                {
                    return false;
                }
            }
            else
            {
                if(!set.contains(st))
                {
                    map.put(p,st);
                    set.add(st);
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}

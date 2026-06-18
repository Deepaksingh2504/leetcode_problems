// ISOMORPHIC STRING

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char th=t.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch)!=th)
                {
                    return false;
                }
            }
            else 
            {
                if(!set.contains(th))
                {
                    map.put(ch,th);
                    set.add(th);
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

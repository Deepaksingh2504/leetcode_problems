// SORT CHARACTER BY FREQUENCY

class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();

        for( char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Character>list=new ArrayList<>();
         for( char c :map.keySet())
        {
           list.add(c);
        }

        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<map.get(list.get(i));j++)
            {
            sb.append(list.get(i));
            }
        }
        return sb.toString();
    }
}

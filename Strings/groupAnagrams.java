// GROUP ANAGRAMS

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>>result=new ArrayList<>();

        HashMap<String,List<String>>map=new HashMap<>();

        for (int i=0; i<strs.length;i++)
        {
            String word=strs[i];
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);

            
            if(!map.containsKey(sortedString))
            {
                 map.put(sortedString, new ArrayList<String>());
                 map.get(sortedString).add(word);
            }
            else
            {
              map.get(sortedString).add(word);
            }
               
        }

        for( List<String> v: map.values())
        {
            result.add(v);
        }

        return result;
    }
}

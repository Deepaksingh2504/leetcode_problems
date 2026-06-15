// UNIQUE NUMBER OF OCCURENCE

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>set=new HashSet<>();

        for( int v:map.keySet())
        {
            if(set.contains(map.get(v)))
            {
                return false;
            }
            set.add(map.get(v));
        }
        return true;
    }
}

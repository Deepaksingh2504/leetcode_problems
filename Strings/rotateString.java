// ROTATE STRINGS

  class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length())
        {
            return false; 
        }
        String news=s+s;
        news.trim();

   return news.contains(goal);
}
}

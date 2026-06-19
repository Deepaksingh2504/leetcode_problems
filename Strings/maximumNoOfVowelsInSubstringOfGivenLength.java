// MAXIMUM NUMBER OF VOWELS IN A SUBSTRING OF A GIVEN LENGTH

class Solution {
    public int maxVowels(String s, int k) {
      
        int count =0;
        int maxCount=0;

        int right=0;
        int left=0;

        while(right<s.length())
        {
            char ch=s.charAt(right);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }

            if(right-left+1==k)
            {
                char leftCharacter=s.charAt(left);
                maxCount=(int)Math.max(maxCount,count);

                 if(leftCharacter=='a'|| leftCharacter=='e'||leftCharacter=='i'||leftCharacter=='o'||leftCharacter=='u')
                 {
                     count--;
                 }
                 left++;

            }
            right++;
        }
        return maxCount;
    }
}

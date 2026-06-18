// FIND COMMON CHARACTER


class Solution {
    public List<String> commonChars(String[] words) {

        ArrayList<String>result=new ArrayList<>();
        
        int firstWordFrequency[]=new int[26];

        for(int i=0;i<words[0].length();i++)
        {
            firstWordFrequency[words[0].charAt(i)-'a']++;
        }
     

        for(int i=1;i<words.length;i++)
        {
            int freqofword[]=new int[26];

            String s=words[i];

             for(int j=0;j<words[i].length();j++)
        {
            freqofword[s.charAt(j)-'a']++;
        }

        for(int k=0;k<26;k++)
        {
            if(firstWordFrequency[k]>0)
            {
            firstWordFrequency[k]=(int)Math.min(firstWordFrequency[k],freqofword[k]);
            }
        }
        }

        for (int i=0;i<26;i++)
        {
          
            if(firstWordFrequency[i]>0)
            {
                for(int j=0;j<firstWordFrequency[i];j++)
                {
                   result.add(String.valueOf((char)(i+'a')));
                }
            }
        }

        return result;

    }
}

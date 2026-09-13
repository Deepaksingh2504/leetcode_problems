// Delete operation for two strings

class Solution {
    public int minDistance(String word1, String word2) {
        
        int dp[][]=new int[word1.length()+1][word2.length()+1];

        for(int i=0;i<word1.length()+1;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        LCS(word1,word2,word1.length(),word2.length(),dp);

        int result = word1.length()- dp[word1.length()][word2.length()] + word2.length()-dp[word1.length()][word2.length()];

        return result;
    }

    int LCS(String word1,String word2,int i,int j,int dp[][])
    {
        
        if(i==0||j==0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(word1.charAt(i-1)==word2.charAt(j-1))
        {
            return dp[i][j]=1+LCS(word1,word2,i-1,j-1,dp);
        }

        return dp[i][j]= (int)Math.max(LCS(word1,word2,i,j-1,dp),LCS(word1,word2,i-1,j,dp));
    }
}

// minimum insertion to make string palindrome

class Solution {
    public int minInsertions(String s) {
        int dp[][]=new int[s.length()+1][s.length()+1];

        for(int i=0;i<s.length()+1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        StringBuilder sb=new StringBuilder(s);
        int res=LCS(s,sb.reverse().toString(),s.length(),s.length(),dp);

    return s.length()-res;
    }

    int LCS(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==0||j==0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            return dp[i][j]=1+LCS(s1,s2,i-1,j-1,dp);
        }

         return dp[i][j]=(int)Math.max(LCS(s1,s2,i-1,j,dp),LCS(s1,s2,i,j-1,dp));
    }
}

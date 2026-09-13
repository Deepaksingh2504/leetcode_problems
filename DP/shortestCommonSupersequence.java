// shortest common supersequence


class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int dp[][]=new int[str1.length()+1][str2.length()+1];

        for(int i=0;i<dp.length;i++)
        {
                Arrays.fill(dp[i],-1);
        }

        LCS(str1,str2,str1.length(),str2.length(),dp);
        StringBuilder sb=new StringBuilder();
        int i=str1.length();
        int j=str2.length();

        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                sb.append(str1.charAt(i-1));
                i--;j--;
            }
           else if(dp[i-1][j]>dp[i][j-1])
            {
                 sb.append(str1.charAt(i-1));
                 i--;
            }
            else
            {
                 sb.append(str2.charAt(j-1));
                 j--;
            }
        }

        while(i>0)
        {
             sb.append(str1.charAt(i-1));
             i--;
        }

         while(j>0)
        {
             sb.append(str2.charAt(j-1));
             j--;
        }
        return sb.reverse().toString();
    }

    int LCS(String str1,String str2,int i , int j, int dp[][])
    {
        if(i==0||j==0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(str1.charAt(i-1)==str2.charAt(j-1))
        {
            return dp[i][j]=1+LCS(str1,str2,i-1,j-1,dp);
        }

        return dp[i][j]=(int)Math.max(LCS(str1,str2,i-1,j,dp),LCS(str1,str2,i,j-1,dp));

    }
}

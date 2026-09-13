// minimum ASCII delete sum for two string

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        int dp[][]=new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<s1.length()+1;i++)
        {
            Arrays.fill(dp[i],-1);
        }



        int sum=  LCS(s1,s2,s1.length(),s2.length(),dp);;
        int i=s1.length();
        int j=s2.length();

        int sum1=0;
        int sum2=0;
        for(char c: s1.toCharArray())
        {
            sum1+=c;
        }
        for(char c: s2.toCharArray())
        {
            sum2+=c;
        }
        return  sum1+sum2-(2*sum);
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
            return dp[i][j]=s1.charAt(i-1)+ LCS(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]= (int)Math.max(LCS(s1,s2,i-1,j,dp),LCS(s1,s2,i,j-1,dp));
    }
}

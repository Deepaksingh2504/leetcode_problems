// LARGEST THREE SAME DIGIT NUMBER IN A STRING

class Solution {
    public String largestGoodInteger(String num) {
        
       
        int maxInt=Integer.MIN_VALUE;
        for(int i=0; i<num.length(); i++)
        {
             int numb=0;
            
            if(i+2<num.length()&& num.charAt(i)==num.charAt(i+1)
                && num.charAt(i)==num.charAt(i+2))

                {
                    numb=Integer.parseInt(num.substring(i,i+3));
                    maxInt=(int)Math.max(numb,maxInt);
                }
                else
                {
                    continue;
                }
        }
        if(maxInt==0)
        {
            return "000";
        }

        return maxInt== Integer.MIN_VALUE ?"":Integer.toString(maxInt);
    }
}

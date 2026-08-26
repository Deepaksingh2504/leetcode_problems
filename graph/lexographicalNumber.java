// Lexographical numbers

class Solution {
    private  ArrayList<Integer>list=new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {

        for(int i=1;i<=9;i++)
        {         
            dfs(i,n);
        }
        
        return list;
    }

    void dfs(int current, int n)
    {
        if(current>n)
        {
            return;
        }

        list.add(current);

        for(int i=0;i<10;i++)
        {
            dfs(current*10+i,n);
        }
    }
}

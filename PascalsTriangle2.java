/*

Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

*/

class Solution {
    public List<Integer> getRow(int numRows) {
           
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 1; i<=numRows+1; i++)
        {
            List<Integer> temp = new ArrayList<Integer>();
            if(i==1)
            {
                temp.add(1);
                ans.add(temp);
            }
            else
                if(i==2)
                {
                    temp.add(1);
                    temp.add(1);
                    ans.add(temp);
                }
            else
            {
                List<Integer> last = new ArrayList<Integer>(ans.get(ans.size()-1));
                temp.add(last.get(0));
                int iter = 1;
                while(iter < last.size())
                {
                    temp.add(last.get(iter) + last.get(iter-1));
                    iter++;
                }
                temp.add(last.get(last.size()-1));
                ans.add(temp);
            }                
        }
        return ans.get(ans.size()-1);
    }
}
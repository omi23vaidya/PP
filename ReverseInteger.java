/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

*/

public class Solution {
    public int reverse(int x) {
        int ans=0;
        if(x>0)
        {
        while(x!=0)
        {
            ans = ans * 10 + (x % 10);
            if(((ans-(x%10))%10)!=0)
            {    
                return 0;
            }   
            x = x / 10;
        }
        return ans;
        }
        else
        {
            x = 0 - (x);
            while(x!=0)
        {
            ans = ans * 10 + (x % 10);
            if(((ans-(x%10))%10)!=0)
            {    
                return 0;
            }
            x = x / 10;
        }
        return (0-ans);
        }
    }
}
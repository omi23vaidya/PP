/*
Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.


Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated

*/

class Solution {
    public int mySqrt(int x) {
    
        int left = 1;
        int right = x;
        int mid;
        while(left <= right)
        {
            //to handle integer overflow, doing this way of finding mid
            mid = left + (right - left)/2;
            
            //checking mid^2 = x
            if(mid == x/mid)
            {
                return mid;
            }
            else if(mid < x/mid)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        
        return right;
        
    }
}
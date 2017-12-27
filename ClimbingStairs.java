/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/

class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        
        //number of steps until n-1
        int one_step_before_final = 2;
        
        //number of steps until n-2
        int two_step_before_final = 1;
        int total_ways = 0;
        
        for(int i = 3 ; i <= n ; i++)
        {
            total_ways = one_step_before_final + two_step_before_final;
            two_step_before_final = one_step_before_final;
            one_step_before_final = total_ways;
        }
        
        return total_ways;
    }
}
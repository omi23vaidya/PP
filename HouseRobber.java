/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

class Solution {
    public int rob(int[] nums) {
        /*
        Analysis of this problem:
        we can figure out the SubProblem to find out the maximun of (dp[i-1], dp[i-2]+num[i]). if we have 3 nums, [1,4,2], then we just               compare (dp[0]+num[2] , dp[1]) which comes to the answer.

        dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        the subProblem.
        Credits to tusizi!
        */
        
        int len = nums.length;
        if(len == 0)
            return 0;
        else if(len == 1)
            return nums[0];
        else
        {
            int dp[] = new int[len];
            dp[0] = nums[0];
            dp[1] = Math.max(dp[0],nums[1]);
            int max = dp[1];
            for(int i=2; i<len; i++)
            {
                dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
                max = Math.max(max, dp[i]);
            }
            return max;
        }
    }
}
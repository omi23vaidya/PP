/*

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2
Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

public class Solution {
    public int missingNumber(int[] nums) {
        /*
        int[] count = new int[nums.length+1];
        for(int i=0; i<nums.length; i++)
        {
            count[nums[i]]++;
        }
        
        for(int i=0; i<count.length; i++)
        {
            if(count[i]==0)
                return i;
        }
        return 0;
        */
         int sum=0;
         int len=nums.length+1;
           for(int n:nums)
              sum+=n;
         
        return ((len*(len-1)) /2-sum);
    }
}